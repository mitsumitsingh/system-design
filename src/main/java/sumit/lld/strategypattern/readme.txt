Problem :- If a child have common implementation(Common feature), it's a redundant code.
Solution :- Strategy Pattern

Eg :-            A (A has c1 capability)
               /   \
              B --- C (B and C has c2 capability) -> So in this case we have to problem, because we need to implement c2 in both B and C class. To solve this problem we can go with the Strategy Pattern.
             /       \
            D         E