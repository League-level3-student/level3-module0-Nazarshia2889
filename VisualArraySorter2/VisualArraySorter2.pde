int[] numbers;

void setup() {
  //2. set the size of your window
  size(1000, 1000);

  //3. initialize your array with the built in width variable
  numbers = new int[width];
  
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built-in height variable, (int)random(height)
  for(int i = 0;i<height;i++){
    numbers[i] = (int)random(height);
  }

  //5. call the noStroke() method
  noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
  background(255, 255, 255);

  //7. set the color for your graph using the fill() method
  fill(0, 0, 0);

  //8. draw a rectangle for each int in your array.
  //   the x value will be the index of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is the negative array value at the array index, e.g. -intArray[ i ]
  for(int i = 0;i<numbers.length;i++){
    rect(i, height, 1, -1 * numbers[i]);
    
  }

  //9. call the stepSort method
  stepSort(numbers);

  //10. extract the code from step 4 that randomizes the array into a new method.
  if(mousePressed == true){
    for(int i = 0;i<height;i++){
      numbers[i] = (int)random(height);
    }
  }

  //11. call the method you made in step 10 when the mouse is pressed using the mousePressed variable
  
}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
