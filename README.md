<p align="left">
  <img src="https://github.com/prasvpatel/Spot_Bot/blob/master/Landing_Pge/logos.png" width="175"
</p>

## Inspiration
We got our inspiration for this project directly from out team. 3 of the 4 team members have glasses and this results in a blurry vision when they don't wear them. While trying out the Google Glasses, and going through the struggle of barely seeing anything with our glasses off, one of our teammates asked, why don't we make something which helps the visually impaired. Through sponsor and mentor suggestions, we realized this idea can come to life and we can make it for more than just the visually impaired. And thus, we set away on the journey of building our bot!

## What it does
The Spot Bot travels around the neighbourhood with the user while identifying obstacles along the way. For each obstacle identified by the Spot Bot, the user is notified on what it is, and how to avoid the obstacle. If the user is visually impaired, the Spot Bot sends a voice command telling it where to go.

## How I built it
The Spot Bot uses OpenCV through the mounted external camera attached to a Roomba in order to analyze the environment around the user and identify obstacles on the way. Once, the Roomba has identified the obstacle on the path, it sends the user a command via FireBase. If the user is just visually impaired, it will send a voice output using a speaker back to the user telling him/her on which direction to go! Meanwhile, if the user is both visually and hearing impaired, other measures can be implemented to ensure the Spot Bot can communicate correctly with the user such as haptic feedback using the moto 360 watch. After each time the user crosses an obstacle, the FireBase updates, and sends the new info received by the OpenCV running camera to the user!

## Challenges I ran into
We ran into a lot of major challenges along the way as it was our first time working with hardware that used OpenCV. For the first 24 hours, we spent time learning about the Arduino's, OpenCV, Raspberry Pi's, etc. This only left us 12 hours to actually make our hack. Our major problem came with OpenCV as we quickly realized it was not as easy as it seemed! Writing a program to get the camera to analyze live-feed data sets and relay back key points on where the obstacle occurs was the hardest fragment of OpenCV. Getting it done on a still-image, was an easy task but live data was a whole other obstacle! Another problem we ran into was connecting the Moto 360 to Android Studio as for the longest time we could not get the watch to pair with one of our phones!

## Accomplishments that I'm proud of
A major accomplishment for 2 of our team members was staying up for a good 24 hours as it was their first hackathon! We felt proud on introducing them into the community of hackers and hackathons! Another accomplishment that we are proud of is learning and applying the OpenCV library as we spent over 3/4 of the hackathon just learning it. The opportunity to apply it to a real-life social problem was a accomplishment for us!

## What I learned
From this hackathon, we learned about OpenCV and hardware such as a roomba. As we have never been able to use the two together, we felt proud on learning both OpenCV and Hardware and applying them to a social problem! Additionally, we learned that sleep is of the essence, and getting less than 4 hours of sleep for 2 of the newbie's on this team, is not a good idea!

## What's next for Guide_Bot
We want to see the Guide Bot being applied to real life issues and scenarios. The program also has quite a few bugs which we plan to fix!
