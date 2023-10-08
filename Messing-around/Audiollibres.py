from pytube import YouTube
# cls command clean terminal

link = input('Introduzca la obra de la cual quiere jactarse, mi buen señor: ')

yt = YouTube(link)

print(str(yt.streams.filter(only_audio=True).all()))
yt.streams.get_by_itag(str(input('Enter tag: '))).download(
    'C:\\Users\\Arnau\\Desktop\\audiolibros')


print(yt.title + ' ya forma parte de su colección pribada, maestro.')
