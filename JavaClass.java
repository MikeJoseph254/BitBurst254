<!DOCTYPE html>
<html>
<head>
<title>Interactive Example</title>
<style>
  body {
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    height: 100vh;
    transition: background-color 0.5s;
  }
  button {
    padding: 10px 20px;
    font-size: 16px;
    cursor: pointer;
    margin-bottom: 10px;
  }
  #quote {
    font-size: 18px;
    margin-bottom: 20px;
    max-width: 80%;
    text-align: center;
  }
</style>
</head>
<body>

<button id="colorButton">Change Color</button>
<p id="counter">Clicks: 0</p>
<p id="quote">"Click the button to display a random quote."</p>
<input type="text" id="userQuote" placeholder="Enter your own quote">
<button id="quoteButton">Show User Quote</button>

<script>
const colors = ["#FF5733", "#C70039", "#900C3F", "#581845", "#4A235A", "#154360", "#1E8449", "#117A65"];
const quotes = [
  "The only limit to our realization of tomorrow will be our doubts of today.",
  "In the middle of every difficulty lies opportunity.",
  "Strive not to be a success, but rather to be of value.",
  "The future depends on what you do today."
];
let clickCount = 0;

document.getElementById("colorButton").addEventListener("click", function() {
  const randomIndex = Math.floor(Math.random() * colors.length);
  const randomColor = colors[randomIndex];
  document.body.style.backgroundColor = randomColor;
  
  clickCount++;
  document.getElementById("counter").textContent = `Clicks: ${clickCount}`;
});

document.getElementById("quoteButton").addEventListener("click", function() {
  const randomIndex = Math.floor(Math.random() * quotes.length);
  const randomQuote = quotes[randomIndex];
  document.getElementById("quote").textContent = `"${randomQuote}"`;
});

document.getElementById("userQuote").addEventListener("keyup", function(event) {
  if (event.key === "Enter") {
    const userQuote = document.getElementById("userQuote").value;
    if (userQuote.trim() !== "") {
      quotes.push(userQuote);
      document.getElementById("userQuote").value = "";
      alert("Your quote has been added!");
    }
  }
});

const animatedElements = document.querySelectorAll('.animated');

function animateElements() {
  animatedElements.forEach(element => {
    const bounding = element.getBoundingClientRect();
    if (bounding.top < window.innerHeight) {
      element.style.opacity = '1';
      element.style.transform = 'translateY(0)';
    }
  });
}

window.addEventListener('scroll', animateElements);
animateElements();
</script>
<!-- Add this JavaScript block just before the closing </body> tag -->
<script>

document.addEventListener("DOMContentLoaded", function() {
  const form = document.querySelector(".contact-form form");
  const nameInput = document.getElementById("name");
  const emailInput = document.getElementById("email");
  const messageInput = document.getElementById("message");

  form.addEventListener("submit", function(event) {
    event.preventDefault();

    // Perform basic form validation
    if (!nameInput.value.trim() || !emailInput.value.trim() || !messageInput.value.trim()) {
      alert("Please fill in all fields before submitting.");
      return;
    }

    // Assuming you have a function to send the form data to a server
    // You can replace this with your actual submission logic
    sendFormToServer(nameInput.value, emailInput.value, messageInput.value);

    // Clear form fields after submission
    nameInput.value = "";
    emailInput.value = "";
    messageInput.value = "";

    // Show a confirmation message
    alert("Thank you for your message! We will get back to you soon.");
  });
});

function sendFormToServer(name, email, message) {
  // Implement your logic here to send form data to the server
  // For example, you could use AJAX or Fetch API to send the data
  // to your server-side script.
}
</script>
<!-- ... (Your existing HTML code) -->

<script>
document.addEventListener("DOMContentLoaded", function() {
    const productImages = document.querySelectorAll(".product-card img");

    productImages.forEach(image => {
        image.addEventListener("click", function() {
            // Add an animation class to the clicked image
            this.classList.add("animated");
            
            // Remove the animation class after the animation completes
            setTimeout(() => {
                this.classList.remove("animated");
            }, 1000); // Adjust the timing (in milliseconds) as needed
        });
    });
});
</script>

<!-- ... (Rest of your HTML) -->
</body>
</html>