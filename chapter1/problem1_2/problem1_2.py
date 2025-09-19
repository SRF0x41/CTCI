def checkPermutation_1(word1,word2):
    if len(word1) != len(word2):
        return False

    for character in word1:
        if character not in word2:
            return False
    return True

def checkPermutation_2(word1,word2):
    pass



def main():
    '''Check Permutation: Given two strings, write a method to decide if one is a permutation of the
other.
Hints: f t , #84, #122, #131'''

    std_in = ""

    while std_in != "quit":
        std_in = input("Given two words check for permutation: ")
        # remove end and beggining whitespace
        std_in.strip()

        # split at the middle whitespace only works for one space
        words = std_in.split(" ")
        print(words[0])
        print(words[1])

        #feed function
        print(checkPermutation_1(words[0],words[1]))






if __name__ == "__main__":
    main()
