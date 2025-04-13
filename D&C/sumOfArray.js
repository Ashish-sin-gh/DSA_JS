// focus of this code is to learn divide and conqure
// sum of all element in an array using D&C (recursive method)

// in D&C method, u have to break the problem into smaller problem and then solve it

// like in this code we will bring the array to its smallest form i.e. with length one and then move up while summing elements up

// [1,2,3,4,5]

function sum(arr, index = 0) {
  if (index >= arr.length) {
    return 0;
  }
  return arr[index] + sum(arr, index + 1);
}

console.log(sum([1, 2, 3, 4, 5]));
