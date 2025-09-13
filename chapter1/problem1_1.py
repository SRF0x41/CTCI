import sys

def IsUnique1(word):
    recorded_characters = []

    for character in word:
        if character in recorded_characters: 
            return False
        recorded_characters.append(character)
    return True
    

def IsUnique2(word):
    seen_characters = [False] * 256
    for character in word:
        if seen_characters[ord(character)]:
            return False
        seen_characters[ord(character)] = True
    return True



def main():
    '''Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
    cannot use additional data structures?
    Hints: #44, #117, #132
    '''
    
    print(IsUnique1(sys.argv[1]))
    print(IsUnique2(sys.argv[1]))





if __name__ == "__main__":
    main()



