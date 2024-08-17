# Persuasive Cued Click Points (PCCP)

## Introduction

Persuasive Technology was first articulated by Fogg as using technology to motivate and influence people to behave in a desired manner. It represents the emerging field of "interactive computing systems designed to change people's attitudes and behaviors." An authentication system applying Persuasive Technology should guide and encourage users to select stronger passwords without imposing system-generated passwords.

To be effective, users must not ignore the persuasive elements, and the resulting passwords must be memorable. Our proposed system accomplishes this by making the task of selecting a weak password more tedious and time-consuming. The path of least resistance for users is to select a stronger password, not comprised entirely of known hotspots or following a predictable pattern. As a result, the system minimizes the formation of hotspots across users since click points are more randomly distributed.

## How PCCP Works

PCCP encourages users to select more secure passwords and makes it more difficult to choose passwords where all five click-points are hotspots. When users create a password, the images are slightly shaded except for a randomly positioned viewport. The viewport is positioned randomly rather than specifically to avoid known hotspots, which attackers could exploit to improve guesses and which could also lead to new hotspots.

The viewport's size offers a variety of distinct points but still covers an acceptably small fraction of all possible points. Users must select a click-point within this highlighted viewport and cannot click outside it. If they are unwilling or unable to select a click-point in this region, they can press the "shuffle" button to reposition the viewport randomly. While users can shuffle as often as they like, this significantly slows the password creation process.

The viewport and shuffle buttons only appear during password creation. During password confirmation and login, the images are displayed normally, without shading or the viewport, and users can click anywhere.

## Objective of the Project

The objective of this project is to enhance security using graphical passwords with viewport and persuasive technology. We use persuasion to influence user choice in click-based graphical passwords, encouraging users to select more random, and hence more difficult to guess, click-points. The goal is to make users select strong passwords using graphical authentication called PCCP.

## Advantages of PCCP

The major advantage of the Persuasive Cued Click Point scheme is its large password space, as the entire image is used for generating the password, reducing the number of hotspots in the image compared to existing click-based graphical password systems. Therefore, it provides better security. The system's randomness is significantly higher in comparison to both single-image multi-point based techniques and multi-image single-point based techniques.

The system offers feature-based matching instead of point-based matching, so the physical password does not store the image points, thereby securing the password to a great extent. The system allows users to select the first image at the time of authentication, eliminating the need to expose the gallery for every image. This makes it difficult for imposters to remember the first image and viewport, making the system better equipped to deal with false acceptance and shoulder surfing attacks.

## Future Improvements

This method can be further improved by incorporating better image features than color features. Texture descriptors could be used for complex images to enhance security and usability further.
