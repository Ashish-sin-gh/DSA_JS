function binarySearch(arr, target, start, end) {
  // base case
  if (start > end) {
    return -1; // target not found
  }

  const mid = Math.floor(start + (end - start) / 2);

  if (target === arr[mid]) {
    return mid;
  } else if (target < arr[mid]) {
    return binarySearch(arr, target, start, mid - 1);
  } else {
    return binarySearch(arr, target, mid + 1, end);
  }
}

let arr = [1, 2, 3, 4, 5];

console.log(binarySearch(arr, 6, 0, arr.length - 1));
