const images = [
    "images/aston-martin.jpg",
    "images/audi-rs-e-tron-gt.jpg",
    "images/maserati-mc20.jpg",
    "images/nio-et5.jpg"
];

let currentIndex = 0;
const sliderImage = document.getElementById("slider-image");
const prevButton = document.getElementById("prev-btn");
const nextButton = document.getElementById("next-btn");

// Function to update image
function updateImage() {
    sliderImage.src = images[currentIndex];
    
    // Disable buttons at first and last images
    prevButton.disabled = currentIndex === 0;
    nextButton.disabled = currentIndex === images.length - 1;
}

// Event Listeners
nextButton.addEventListener("click", () => {
    if (currentIndex < images.length - 1) {
        currentIndex++;
        updateImage();
    }
});

prevButton.addEventListener("click", () => {
    if (currentIndex > 0) {
        currentIndex--;
        updateImage();
    }
});

// Initialize the slider (disable prev button initially)
updateImage();
