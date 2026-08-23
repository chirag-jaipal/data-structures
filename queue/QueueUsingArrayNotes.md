# Queue Using Array: Implementation Limitation

`QueueUsingArray` is implemented with a fixed-size, linear array and two indexes:

- `front` points to the next element to be removed.
- `rear` points to the next free position.
- `front` and `rear` move only from left to right.

The implementation correctly validates the capacity and calculates the current length using:

```java
rear - front
```

However, it still has the following limitation.

## Freed array positions cannot be reused

When an element is dequeued, `front` moves forward. The position that was occupied becomes free,
but a later `enqueue()` always writes at `rear`; it never returns to the free positions before
`front`.

Example with capacity `5`:

```text
Initial:              [10, 20, 30, 40, 50]
After three dequeues: [__, __, __, 40, 50]

front = 3
rear  = 5
length() = rear - front = 2
```

The first three positions are free, but `isFull()` checks only whether `rear` has reached the end
of the array:

```java
return this.rear == this.arr.length;
```

Therefore, `isFull()` returns `true`, and another enqueue throws `Queue Overflow`, even though the
array contains unused positions.

## The queue can be both empty and full

After all elements are dequeued from a queue of capacity `5`:

```text
front = 5
rear  = 5
length() = 0
```

At this point:

```java
isEmpty() == true
isFull()  == true
```

`isEmpty()` is correct because there are no elements. `isFull()` is also technically correct for
this implementation because `rear` has reached the array boundary. However, the combination shows
the practical limitation: the queue is empty but cannot be used for another enqueue.

## Fixed capacity

The array size is fixed when the queue is created. If the queue reaches its capacity, enqueueing
another element fails. This is acceptable when a bounded queue is intended, but it is limiting when
the required number of elements is not known in advance.

## Why this is a drawback of the linear array approach

This is not a problem with arrays themselves. It happens because this implementation treats the
array as a one-way, linear sequence. The indexes do not wrap around, so storage released at the
front is lost for future enqueue operations.

## Better approach: circular queue

A circular array queue reuses freed positions by wrapping indexes back to the beginning:

```java
rear = (rear + 1) % arr.length;
front = (front + 1) % arr.length;
```

A circular implementation should also maintain a `size` field:

```text
isEmpty(): size == 0
isFull():  size == arr.length
length(): size
```

Tracking `size` distinguishes an empty queue from a full queue, while wrapping `front` and `rear`
allows the queue to reuse every array position.

## Summary

The main drawback of this implementation is **wasted space**: dequeued positions cannot be reused.
As a result, the queue may be empty and full at the same time, and it becomes unusable for new
enqueues after `rear` reaches the end of the array.

For a reusable array-based queue, use a circular array with `front`, `rear`, and `size`.
