#include <iostream>
#include <string>
using namespace std;

int isUnique(string word){
	//cout << word << '\n';
    //cout << word.length() << '\n';
    int seen_characters[256];

    // Setting all seen characters to false
    for(size_t i = 0; i < sizeof(seen_characters) / sizeof(seen_characters[0]); i++){
        seen_characters[i] = 0;
    }

    for(int i = 0; i < word.length(); i++){
        if(seen_characters[word.at(i)]){
            return 0;
        }
        seen_characters[word.at(i)] = 1;
    }
    return 1;
}

int main(int argc, char* argv[]) {

    cout << isUnique(argv[1]);


}