// recursion always has 2 cases -
// 1. base case
// 2. recursive case

function countdown(i) {
  if (i <= 0) {
    // base case
    return;
  } else {
    // recursive case
    countdown(i - 1);
  }
  console.log(i);
}

countdown(10);
