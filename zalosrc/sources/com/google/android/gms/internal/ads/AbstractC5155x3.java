package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x3 */
/* loaded from: classes2.dex */
abstract class AbstractC5155x3 {

    /* renamed from: a */
    static final String[] f30313a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: a */
    public static zzbp m27819a(x02 x02Var) {
        String str;
        String str2;
        int m27780k = x02Var.m27780k() + x02Var.m27782m();
        int m27782m = x02Var.m27782m();
        int i11 = (m27782m >> 24) & 255;
        zzbp zzbpVar = null;
        try {
            if (i11 != 169 && i11 != 253) {
                if (m27782m == 1735291493) {
                    int m27820b = m27820b(x02Var);
                    if (m27820b > 0 && m27820b <= 192) {
                        str2 = f30313a[m27820b - 1];
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        zzbpVar = new zzadl("TCON", null, str2);
                    } else {
                        lr1.m24356e("MetadataUtil", "Failed to parse standard genre code");
                    }
                    x02Var.m27775f(m27780k);
                    return zzbpVar;
                }
                if (m27782m == 1684632427) {
                    zzadl m27822d = m27822d(1684632427, "TPOS", x02Var);
                    x02Var.m27775f(m27780k);
                    return m27822d;
                }
                if (m27782m == 1953655662) {
                    zzadl m27822d2 = m27822d(1953655662, "TRCK", x02Var);
                    x02Var.m27775f(m27780k);
                    return m27822d2;
                }
                if (m27782m == 1953329263) {
                    zzadd m27821c = m27821c(1953329263, "TBPM", x02Var, true, false);
                    x02Var.m27775f(m27780k);
                    return m27821c;
                }
                if (m27782m == 1668311404) {
                    zzadd m27821c2 = m27821c(1668311404, "TCMP", x02Var, true, true);
                    x02Var.m27775f(m27780k);
                    return m27821c2;
                }
                if (m27782m == 1668249202) {
                    int m27782m2 = x02Var.m27782m();
                    if (x02Var.m27782m() == 1684108385) {
                        int m27782m3 = x02Var.m27782m() & 16777215;
                        if (m27782m3 == 13) {
                            str = "image/jpeg";
                        } else if (m27782m3 == 14) {
                            str = "image/png";
                            m27782m3 = 14;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            lr1.m24356e("MetadataUtil", "Unrecognized cover art flags: " + m27782m3);
                        } else {
                            x02Var.m27776g(4);
                            int i12 = m27782m2 - 16;
                            byte[] bArr = new byte[i12];
                            x02Var.m27771b(bArr, 0, i12);
                            zzbpVar = new zzaco(str, null, 3, bArr);
                        }
                    } else {
                        lr1.m24356e("MetadataUtil", "Failed to parse cover art attribute");
                    }
                    x02Var.m27775f(m27780k);
                    return zzbpVar;
                }
                if (m27782m == 1631670868) {
                    zzadl m27823e = m27823e(1631670868, "TPE2", x02Var);
                    x02Var.m27775f(m27780k);
                    return m27823e;
                }
                if (m27782m == 1936682605) {
                    zzadl m27823e2 = m27823e(1936682605, "TSOT", x02Var);
                    x02Var.m27775f(m27780k);
                    return m27823e2;
                }
                if (m27782m == 1936679276) {
                    zzadl m27823e3 = m27823e(1936679276, "TSO2", x02Var);
                    x02Var.m27775f(m27780k);
                    return m27823e3;
                }
                if (m27782m == 1936679282) {
                    zzadl m27823e4 = m27823e(1936679282, "TSOA", x02Var);
                    x02Var.m27775f(m27780k);
                    return m27823e4;
                }
                if (m27782m == 1936679265) {
                    zzadl m27823e5 = m27823e(1936679265, "TSOP", x02Var);
                    x02Var.m27775f(m27780k);
                    return m27823e5;
                }
                if (m27782m == 1936679791) {
                    zzadl m27823e6 = m27823e(1936679791, "TSOC", x02Var);
                    x02Var.m27775f(m27780k);
                    return m27823e6;
                }
                if (m27782m == 1920233063) {
                    zzadd m27821c3 = m27821c(1920233063, "ITUNESADVISORY", x02Var, false, false);
                    x02Var.m27775f(m27780k);
                    return m27821c3;
                }
                if (m27782m == 1885823344) {
                    zzadd m27821c4 = m27821c(1885823344, "ITUNESGAPLESS", x02Var, false, true);
                    x02Var.m27775f(m27780k);
                    return m27821c4;
                }
                if (m27782m == 1936683886) {
                    zzadl m27823e7 = m27823e(1936683886, "TVSHOWSORT", x02Var);
                    x02Var.m27775f(m27780k);
                    return m27823e7;
                }
                if (m27782m == 1953919848) {
                    zzadl m27823e8 = m27823e(1953919848, "TVSHOW", x02Var);
                    x02Var.m27775f(m27780k);
                    return m27823e8;
                }
                if (m27782m == 757935405) {
                    String str3 = null;
                    String str4 = null;
                    int i13 = -1;
                    int i14 = -1;
                    while (x02Var.m27780k() < m27780k) {
                        int m27780k2 = x02Var.m27780k();
                        int m27782m4 = x02Var.m27782m();
                        int m27782m5 = x02Var.m27782m();
                        x02Var.m27776g(4);
                        if (m27782m5 == 1835360622) {
                            str3 = x02Var.m27766E(m27782m4 - 12);
                        } else if (m27782m5 == 1851878757) {
                            str4 = x02Var.m27766E(m27782m4 - 12);
                        } else {
                            if (m27782m5 == 1684108385) {
                                i14 = m27782m4;
                            }
                            if (m27782m5 == 1684108385) {
                                i13 = m27780k2;
                            }
                            x02Var.m27776g(m27782m4 - 12);
                        }
                    }
                    if (str3 != null && str4 != null && i13 != -1) {
                        x02Var.m27775f(i13);
                        x02Var.m27776g(16);
                        zzbpVar = new zzadf(str3, str4, x02Var.m27766E(i14 - 16));
                    }
                    return zzbpVar;
                }
            } else {
                int i15 = m27782m & 16777215;
                if (i15 == 6516084) {
                    int m27782m6 = x02Var.m27782m();
                    if (x02Var.m27782m() == 1684108385) {
                        x02Var.m27776g(8);
                        String m27766E = x02Var.m27766E(m27782m6 - 16);
                        zzbpVar = new zzacw("und", m27766E, m27766E);
                    } else {
                        lr1.m24356e("MetadataUtil", "Failed to parse comment attribute: ".concat(AbstractC4561h3.m22690b(m27782m)));
                    }
                    x02Var.m27775f(m27780k);
                    return zzbpVar;
                }
                if (i15 != 7233901 && i15 != 7631467) {
                    if (i15 != 6516589 && i15 != 7828084) {
                        if (i15 == 6578553) {
                            zzadl m27823e9 = m27823e(m27782m, "TDRC", x02Var);
                            x02Var.m27775f(m27780k);
                            return m27823e9;
                        }
                        if (i15 == 4280916) {
                            zzadl m27823e10 = m27823e(m27782m, "TPE1", x02Var);
                            x02Var.m27775f(m27780k);
                            return m27823e10;
                        }
                        if (i15 == 7630703) {
                            zzadl m27823e11 = m27823e(m27782m, "TSSE", x02Var);
                            x02Var.m27775f(m27780k);
                            return m27823e11;
                        }
                        if (i15 == 6384738) {
                            zzadl m27823e12 = m27823e(m27782m, "TALB", x02Var);
                            x02Var.m27775f(m27780k);
                            return m27823e12;
                        }
                        if (i15 == 7108978) {
                            zzadl m27823e13 = m27823e(m27782m, "USLT", x02Var);
                            x02Var.m27775f(m27780k);
                            return m27823e13;
                        }
                        if (i15 == 6776174) {
                            zzadl m27823e14 = m27823e(m27782m, "TCON", x02Var);
                            x02Var.m27775f(m27780k);
                            return m27823e14;
                        }
                        if (i15 == 6779504) {
                            zzadl m27823e15 = m27823e(m27782m, "TIT1", x02Var);
                            x02Var.m27775f(m27780k);
                            return m27823e15;
                        }
                    } else {
                        zzadl m27823e16 = m27823e(m27782m, "TCOM", x02Var);
                        x02Var.m27775f(m27780k);
                        return m27823e16;
                    }
                } else {
                    zzadl m27823e17 = m27823e(m27782m, "TIT2", x02Var);
                    x02Var.m27775f(m27780k);
                    return m27823e17;
                }
            }
            lr1.m24352a("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC4561h3.m22690b(m27782m));
            x02Var.m27775f(m27780k);
            return null;
        } finally {
            x02Var.m27775f(m27780k);
        }
    }

    /* renamed from: b */
    private static int m27820b(x02 x02Var) {
        x02Var.m27776g(4);
        if (x02Var.m27782m() == 1684108385) {
            x02Var.m27776g(8);
            return x02Var.m27788s();
        }
        lr1.m24356e("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: c */
    private static zzadd m27821c(int i11, String str, x02 x02Var, boolean z11, boolean z12) {
        int m27820b = m27820b(x02Var);
        if (z12) {
            m27820b = Math.min(1, m27820b);
        }
        if (m27820b >= 0) {
            if (z11) {
                return new zzadl(str, null, Integer.toString(m27820b));
            }
            return new zzacw("und", str, Integer.toString(m27820b));
        }
        lr1.m24356e("MetadataUtil", "Failed to parse uint8 attribute: ".concat(AbstractC4561h3.m22690b(i11)));
        return null;
    }

    /* renamed from: d */
    private static zzadl m27822d(int i11, String str, x02 x02Var) {
        int m27782m = x02Var.m27782m();
        if (x02Var.m27782m() == 1684108385 && m27782m >= 22) {
            x02Var.m27776g(10);
            int m27792w = x02Var.m27792w();
            if (m27792w > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m27792w);
                String sb3 = sb2.toString();
                int m27792w2 = x02Var.m27792w();
                if (m27792w2 > 0) {
                    sb3 = sb3 + "/" + m27792w2;
                }
                return new zzadl(str, null, sb3);
            }
        }
        lr1.m24356e("MetadataUtil", "Failed to parse index/count attribute: ".concat(AbstractC4561h3.m22690b(i11)));
        return null;
    }

    /* renamed from: e */
    private static zzadl m27823e(int i11, String str, x02 x02Var) {
        int m27782m = x02Var.m27782m();
        if (x02Var.m27782m() == 1684108385) {
            x02Var.m27776g(8);
            return new zzadl(str, null, x02Var.m27766E(m27782m - 16));
        }
        lr1.m24356e("MetadataUtil", "Failed to parse text attribute: ".concat(AbstractC4561h3.m22690b(i11)));
        return null;
    }
}
