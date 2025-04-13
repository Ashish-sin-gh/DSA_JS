// binary search follow divide and conqure algorithm

function bs(arr, target) {
  let low = 0;
  let high = arr.length - 1;

  while (low <= high) {
    let mid = Math.floor(low + (high - low) / 2);

    if (arr[mid] === target) {
      return mid;
    } else if (target > arr[mid]) {
      low = mid + 1;
    } else {
      high = mid - 1;
    }
  }
  return -1;
}

console.log(bs([1, 2, 3, 4, 5, 6], 10));
console.log(bs([1, 2, 3, 4, 5, 6], 1));
console.log(bs([1, 2, 3, 4, 5, 6], 5));
console.log(bs([1, 2, 3, 4, 5, 6], 3));
