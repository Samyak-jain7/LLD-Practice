Objects
1. User
2. Movie
3. Theatre
4. Screens
5. Seats
6. Booking
7. Payment

Concurrency Management is important here.
2 Types of lock
1. Pessimistic
   Read start -> Lock -> Update -> Lock release
   Lock directly when you are going to read an object,
   Only 1 user can read at a time.

2. Optimistic
   In this method we let multiple users read an object and maintain
   versioning of the object being read whenever it is updated.