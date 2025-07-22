def repeat_key(key, length):
    return (key * (length // len(key)+1))[:length]

def encrypt(text, key):
    cipherText = ""
    text = text.upper()
    key = repeat_key(key.upper(), len(text))
    for i in range(len(text)):
        p = ord(text[i]) - 65
        k = ord(key[i]) - 65
        c = (p+k)%26
        cipherText += chr(c+65)
    return cipherText
def decrypt(cipherText, key):
    plainText=""
    key = repeat_key(key.upper(), len(cipherText))
    for i in range(len(cipherText)):
        c = ord(cipherText[i]) - 65
        k = ord(key[i]) - 65
        p = (c-k + 26) % 26
        plainText += chr(p+65)
    return plainText

plainText = "HELLO"
print("Plain Text: ", plainText)
print("Key: ", "KEY")
cipherText = encrypt(plainText, "KEY")
print("Cipher Text: ", cipherText)
decryptedText = decrypt(cipherText, "KEY")
print("Decrypted Text: ", decryptedText)    