package be.kotlin.kotlincourse.stdlib

/**
 * Created by guyheylens on 17/04/17.
 */

data class Album(val title: String, val year: Int, val chartUK: Int, val chartUS: Int, val tracks: List<Track> = listOf())

data class Track(val title:String, val durationInseconds: Int)

val albums = listOf(Album("The dark side of the moon", 1973, 2,1,
                            listOf(Track("Speak to me", 90),
                                    Track("Breathe", 163),
                                    Track("On the run", 216),
                                    Track("Time", 421),
                                    Track("The great gig in the sky", 276),
                                    Track("Money", 382),
                                    Track("Us and them", 462),
                                    Track("Any color you like", 205),
                                    Track("Brian damage",228),
                                    Track("Eclipse",123))),
        Album("The wall", 1979, 3 ,1),
        Album("Wish you were here", 1975,1,1),
        Album("Animals",1977,2,3),
        Album("The piper at the gates of dawn",1967,6,131),
        Album("The final cut",1983,1,6),
        Album("Meddle",1971,3,70),
        Album("Atom heart mother", 1970,1,55),
        Album("Ummagumma",1969,5,74),
        Album("A saucefull of secrets",1968,9,8),
        Album("More",1969,9,153))


fun main(args: Array<String>) {

    for(album in albums){
        if(album.chartUK == 1){
            println("Found - ${album.title}")
        }
    }

    albums.forEach { album -> if(album.chartUK == 1) println("Found - ${album.title}") }

    albums.forEach { if(it.chartUK == 1) println("Found - ${it.title}") }

    //function pipelining (C# LINQ)
    albums.filter { it.chartUK == 1 }.forEach { println("Found - ${it.title}") }

    //all titles with year
    val titles = albums.filter {it.chartUK == 1}.map { Pair(it.title, it.year) }
    titles.forEach { println(it) }


    val test = albumAndTrackWithDurationLowerThanxSeconds(600, albums)

    println(test)


    //map: [a, b, c] f(x) => [f(a), f(b), f(c)]
    //flatmap: [[a,b], [c,d] f(x)]] => [f(a), f(b), f(c)]



}

fun albumAndTrackWithDurationLowerThanxSeconds(durationInSeconds: Int, albums:List<Album>): List<Pair<String, String>>{
    return albums.flatMap {
        val albumTitle = it.title
        it.tracks.filter{it.durationInseconds < durationInSeconds
        }.map{Pair(albumTitle, it.title)
        }
    }
}