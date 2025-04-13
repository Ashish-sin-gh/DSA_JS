let maxNumber = Number.MIN_VALUE;

function maxElement(arr, index) {
  if (index >= arr.length) {
    return;
  } else {
    if (arr[index] > maxNumber) {
      maxNumber = arr[index];
    }
    maxElement(arr, index + 1);
    return maxNumber;
  }
}

console.log(maxElement([1, 2, 3, 4, 5, 99, 8, 7], 0));

/*

function findMax(arr, index = 0, currentMax = -Infinity) {
  // Base case: end of array
  if (index >= arr.length) {
    return currentMax;
  }
  // Update max if current element is larger
  const newMax = arr[index] > currentMax ? arr[index] : currentMax;
  return findMax(arr, index + 1, newMax);
}

*/
