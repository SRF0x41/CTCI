

def IsUnique(word):
    recorded_characters = []

    for character in word:
        if character in recorded_characters: 
            return False
        recorded_characters.append(character)
    return True
    




def main():
    '''Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
    cannot use additional data structures?
    Hints: #44, #117, #132
    '''
    
    print(IsUnique("Hello World"))
    print(IsUnique("World"))





if __name__ == "__main__":
    main()



