class Buffers:
    def init(self):
        s = 'I am a buffer'
        b = memoryview(bytes(s, 'utf-8'))
        print(bytes(s, 'utf-8'))
        print(b)
