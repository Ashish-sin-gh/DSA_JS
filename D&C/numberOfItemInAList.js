let counter = 0;

function count(arr, index) {
  if (index >= arr.length) {
    return;
  } else {
    counter++;
    index++;
    count(arr, index);
    return counter;
  }
}

console.log(count([1, 2, 3, 5, 6, 7, 0], 0));
