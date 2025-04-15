// in quick sort - an element will be said to be sorted if
// all the elements on its left are smaller than the element and
// all the element after that element is greater than itself.

// eg - [6, 7, 4, 10, 12, 14, 11] -> 10 is sorted

// Quicksort has a smaller constant than merge sort.
// So if they’re both O(n log n) time, quicksort is faster

// quicksort - worst case - O(power(n,2))
// quicksort - average case - O(n * log n)

// The performance of quicksort heavily depends on the pivot you choose
let arr = [10, 20, 40, 54545, 50, 40];

quicksort(arr, 0, arr.length - 1);
console.log(arr);

function quicksort(arr, lb, hb) {
  if (lb < hb) {
    let partitionIndex = partition(arr, lb, hb);
    quicksort(arr, lb, partitionIndex - 1);
    quicksort(arr, partitionIndex + 1, hb);
  }
}

function partition(arr, lb, hb) {
  let start = lb;
  let end = hb;
  let pivot = arr[lb];

  while (start < end) {
    while (arr[start] <= pivot) {
      start++;
    }
    while (arr[end] > pivot) {
      end--;
    }

    if (start < end) {
      swap(arr, start, end);
    }
  }
  swap(arr, lb, end);
  return end;
}

function swap(arr, start, end) {
  let temp = arr[start];
  arr[start] = arr[end];
  arr[end] = temp;
}
