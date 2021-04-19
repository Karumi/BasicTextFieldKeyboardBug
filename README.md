# Jetpack Compose newline keyboard bug example

While testing the app with Jetpack Compose we've noticed the component named ``BasicTextField`` is not able to handle newline chars when the keyboard used is not the official one provided by Google. We've tested it with Swiftkey by Microsoft and Emoji keyboard and it is not working as expected. The ``onValueChange`` lambda is invoked but the new ``\np`` char is not added to the text. However, when using the official keyboard Google provides it works like a charm. Look at the screencasts below:

## Working with Google keyboard

![Working with Google keyboard](screencast/workingWithGoogleKeyboard.mp4)

## Not working with Swiftkey keyboard

![Not working with Swiftkey keyboard](screencast/keyboardNotWorkingSwiftkey.mp4)

## Not working with emoji keyboard

![Not working with emoji keyboard](screencast/otherKeyboard.mp4)