import re

def get_msg():
    path = "message.txt"
    txt = ""
    with open(path, "r") as f:
        txt = f.read()
    return txt


def get_badword_and_alternatives():
    file_name = "badwords.txt"
    
    bw_with_alters = []
    with open(file_name, "r") as f:
        lines = f.readlines()
    for i in range(len(lines)):
        cleaned_line = lines[i].strip().split(" ")
        bw_with_alters.append(cleaned_line)
        
    return bw_with_alters



def replace_word(txt, bw_data):
    for i in range(len(bw_data)):
        l = len(bw_data[i])
        badword = bw_data[i][0]
        all_insensitive_cases = re.findall(f'(?i){badword}',
                                           txt)
        
        for ins_case in all_insensitive_cases:

            if l == 2:
                alternator = bw_data[i][1]
                txt = re.sub(fr"\b{ins_case}\b", alternator, txt)

            if l == 1:
                first_letter = ins_case[0]
                last_letter = ins_case[-1]
                bw_len = len(ins_case)
                number_of_asterisk = bw_len - 2
                mid_word = "*" * number_of_asterisk
                censored_word = first_letter + mid_word + last_letter
                txt = txt.replace(ins_case, censored_word)

    return txt

def main():
    
    txt = get_msg()
    bw_data = get_badword_and_alternatives()

    output = replace_word(txt, bw_data)
    print(output)
    
if __name__ == "__main__":
    main()