// add pageTitle
const pageTitle = "My Shopping List";
const groceries = ['apples', 'bananas', 'bread', 'milk', 'water', 'pringles', 'pizza rolls', 'powerade', 'rice', 'chicken'];
// add groceries

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const pageTItleElement = document.getElementById("title");
  pageTItleElement.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
 
  const list = document.querySelector('.shopping-list ul');

  for (let i = 0; i < groceries.length; i++) {
    //create list item
    const listItem = document.createElement('li');
    listItem.innerText = groceries[i];
    //add list item to our main
    list.insertAdjacentElement('beforeend', listItem);
  }

}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
