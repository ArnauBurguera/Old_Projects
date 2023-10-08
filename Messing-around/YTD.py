from pytube import YouTube


link = input('Enter your videico: ')

yt = YouTube(link)

print(str(yt.streams.filter(progressive=True).all()))
#print(str(yt.streams.all()))
#print(str(yt.streams.filter(only_audio=True).all()))
yt.streams.get_by_itag(str(input('Enter tag: '))).download('C:\\Users\\Arnau\\Desktop\\downloads')
    

print('Has been downloaded ma man!' + yt.title)


