import sys

def main():
    ''' Simple program that adds needed spaces to strings for urlify'''
    stripped_text = sys.argv[1].strip()
    space_count = 0
    for character in stripped_text:
        if character == ' ':
            space_count = space_count + 1

    print(stripped_text+ '  ' * space_count)
    print(len(stripped_text))



if __name__ == "__main__":
    main()
