// selection sort algo - it is an algo used for sorting list of elements
// in this algo we use 2 loop - 1 for looping thotough all the passes
//                            - other for finding the smallest number in each pass
// time complexity - O(n power 2);

function findSmallestElementsIndex(arr, i) {
  let smallestElement = arr[i];
  let smallestElesIndex = i;

  for (let j = i + 1; j < arr.length; j++) {
    if (arr[j] < smallestElement) {
      smallestElement = arr[j];
      smallestElesIndex = j;
    }
  }
  return smallestElesIndex;
}

function selectionSort(arr) {
  for (let i = 0; i < arr.length - 1; i++) {
    let smallestElementIndex = findSmallestElementsIndex(arr, i);

    let swapableElement = arr[i];
    arr[i] = arr[smallestElementIndex];
    arr[smallestElementIndex] = swapableElement;
    // console.log(arr[smallestElementIndex]);
    console.log(arr[i]);
  }
  return arr;
}

let sortedArray = selectionSort([5, 4, 3, 2, 12, 54, 0]);
console.log(sortedArray);
