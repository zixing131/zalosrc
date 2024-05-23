package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tk */
/* loaded from: classes2.dex */
abstract class AbstractC5023tk {

    /* renamed from: a */
    private static final int f28392a = AbstractC4916qo.m25831g("nam");

    /* renamed from: b */
    private static final int f28393b = AbstractC4916qo.m25831g("trk");

    /* renamed from: c */
    private static final int f28394c = AbstractC4916qo.m25831g("cmt");

    /* renamed from: d */
    private static final int f28395d = AbstractC4916qo.m25831g("day");

    /* renamed from: e */
    private static final int f28396e = AbstractC4916qo.m25831g("ART");

    /* renamed from: f */
    private static final int f28397f = AbstractC4916qo.m25831g("too");

    /* renamed from: g */
    private static final int f28398g = AbstractC4916qo.m25831g("alb");

    /* renamed from: h */
    private static final int f28399h = AbstractC4916qo.m25831g("com");

    /* renamed from: i */
    private static final int f28400i = AbstractC4916qo.m25831g("wrt");

    /* renamed from: j */
    private static final int f28401j = AbstractC4916qo.m25831g("lyr");

    /* renamed from: k */
    private static final int f28402k = AbstractC4916qo.m25831g("gen");

    /* renamed from: l */
    private static final int f28403l = AbstractC4916qo.m25831g("covr");

    /* renamed from: m */
    private static final int f28404m = AbstractC4916qo.m25831g("gnre");

    /* renamed from: n */
    private static final int f28405n = AbstractC4916qo.m25831g("grp");

    /* renamed from: o */
    private static final int f28406o = AbstractC4916qo.m25831g("disk");

    /* renamed from: p */
    private static final int f28407p = AbstractC4916qo.m25831g("trkn");

    /* renamed from: q */
    private static final int f28408q = AbstractC4916qo.m25831g("tmpo");

    /* renamed from: r */
    private static final int f28409r = AbstractC4916qo.m25831g("cpil");

    /* renamed from: s */
    private static final int f28410s = AbstractC4916qo.m25831g("aART");

    /* renamed from: t */
    private static final int f28411t = AbstractC4916qo.m25831g("sonm");

    /* renamed from: u */
    private static final int f28412u = AbstractC4916qo.m25831g("soal");

    /* renamed from: v */
    private static final int f28413v = AbstractC4916qo.m25831g("soar");

    /* renamed from: w */
    private static final int f28414w = AbstractC4916qo.m25831g("soaa");

    /* renamed from: x */
    private static final int f28415x = AbstractC4916qo.m25831g("soco");

    /* renamed from: y */
    private static final int f28416y = AbstractC4916qo.m25831g("rtng");

    /* renamed from: z */
    private static final int f28417z = AbstractC4916qo.m25831g("pgap");

    /* renamed from: A */
    private static final int f28388A = AbstractC4916qo.m25831g("sosn");

    /* renamed from: B */
    private static final int f28389B = AbstractC4916qo.m25831g("tvsh");

    /* renamed from: C */
    private static final int f28390C = AbstractC4916qo.m25831g("----");

    /* renamed from: D */
    private static final String[] f28391D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001a, B:6:0x001f, B:8:0x0025, B:10:0x002c, B:12:0x0036, B:18:0x0040, B:20:0x0044, B:23:0x004e, B:25:0x0052, B:28:0x005c, B:30:0x0062, B:33:0x006c, B:35:0x0070, B:38:0x007a, B:40:0x007f, B:42:0x008b, B:46:0x00a7, B:47:0x00b5, B:55:0x00ca, B:57:0x00ce, B:60:0x00d8, B:62:0x00dc, B:65:0x00e6, B:67:0x00ea, B:70:0x00f4, B:72:0x00f8, B:75:0x0102, B:77:0x0106, B:80:0x0110, B:82:0x0114, B:85:0x011e, B:87:0x0122, B:90:0x012c, B:92:0x0130, B:95:0x013a, B:97:0x013e, B:100:0x0148, B:102:0x014c, B:105:0x0156, B:108:0x015e, B:110:0x0164, B:129:0x0177, B:113:0x017e, B:126:0x0182, B:116:0x0189, B:121:0x0192, B:132:0x0198, B:134:0x01a0, B:138:0x01ab, B:141:0x0267, B:145:0x01c6, B:147:0x01ca, B:149:0x01d6, B:152:0x01e7, B:153:0x01f4, B:155:0x01f8, B:158:0x01fe, B:160:0x0202, B:163:0x0207, B:165:0x020b, B:168:0x0215, B:170:0x0219, B:173:0x0223, B:175:0x0227, B:178:0x0231, B:180:0x0235, B:183:0x023f, B:185:0x0243, B:188:0x024d, B:190:0x0251, B:193:0x0259, B:195:0x025d, B:198:0x027c, B:201:0x0286), top: B:2:0x0018 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaxg m26622a(C4655jo c4655jo) {
        String str;
        String str2;
        int m23667c = c4655jo.m23667c() + c4655jo.m23669e();
        int m23669e = c4655jo.m23669e();
        zzaxg zzaxgVar = null;
        try {
            if (((m23669e >> 24) & 255) != 169) {
                if (m23669e == f28404m) {
                    int m26623b = m26623b(c4655jo);
                    if (m26623b > 0) {
                        String[] strArr = f28391D;
                        int length = strArr.length;
                        if (m26623b <= 148) {
                            str2 = strArr[m26623b - 1];
                            if (str2 != null) {
                                zzaxgVar = new zzaxp("TCON", null, str2);
                            }
                            c4655jo.m23686v(m23667c);
                            return zzaxgVar;
                        }
                    }
                    str2 = null;
                    if (str2 != null) {
                    }
                    c4655jo.m23686v(m23667c);
                    return zzaxgVar;
                }
                if (m23669e == f28406o) {
                    zzaxp m26625d = m26625d(m23669e, "TPOS", c4655jo);
                    c4655jo.m23686v(m23667c);
                    return m26625d;
                }
                if (m23669e == f28407p) {
                    zzaxp m26625d2 = m26625d(m23669e, "TRCK", c4655jo);
                    c4655jo.m23686v(m23667c);
                    return m26625d2;
                }
                if (m23669e == f28408q) {
                    zzaxn m26624c = m26624c(m23669e, "TBPM", c4655jo, true, false);
                    c4655jo.m23686v(m23667c);
                    return m26624c;
                }
                if (m23669e == f28409r) {
                    zzaxn m26624c2 = m26624c(m23669e, "TCMP", c4655jo, true, true);
                    c4655jo.m23686v(m23667c);
                    return m26624c2;
                }
                if (m23669e == f28403l) {
                    int m23669e2 = c4655jo.m23669e();
                    if (c4655jo.m23669e() == AbstractC4541gk.f20632F0) {
                        int m22460a = AbstractC4541gk.m22460a(c4655jo.m23669e());
                        if (m22460a == 13) {
                            str = "image/jpeg";
                        } else if (m22460a == 14) {
                            str = "image/png";
                            m22460a = 14;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Unrecognized cover art flags: ");
                            sb2.append(m22460a);
                        } else {
                            c4655jo.m23687w(4);
                            int i11 = m23669e2 - 16;
                            byte[] bArr = new byte[i11];
                            c4655jo.m23681q(bArr, 0, i11);
                            zzaxgVar = new zzaxj(str, null, 3, bArr);
                        }
                    }
                    c4655jo.m23686v(m23667c);
                    return zzaxgVar;
                }
                if (m23669e == f28410s) {
                    zzaxp m26626e = m26626e(m23669e, "TPE2", c4655jo);
                    c4655jo.m23686v(m23667c);
                    return m26626e;
                }
                if (m23669e == f28411t) {
                    zzaxp m26626e2 = m26626e(m23669e, "TSOT", c4655jo);
                    c4655jo.m23686v(m23667c);
                    return m26626e2;
                }
                if (m23669e == f28412u) {
                    zzaxp m26626e3 = m26626e(m23669e, "TSO2", c4655jo);
                    c4655jo.m23686v(m23667c);
                    return m26626e3;
                }
                if (m23669e == f28413v) {
                    zzaxp m26626e4 = m26626e(m23669e, "TSOA", c4655jo);
                    c4655jo.m23686v(m23667c);
                    return m26626e4;
                }
                if (m23669e == f28414w) {
                    zzaxp m26626e5 = m26626e(m23669e, "TSOP", c4655jo);
                    c4655jo.m23686v(m23667c);
                    return m26626e5;
                }
                if (m23669e == f28415x) {
                    zzaxp m26626e6 = m26626e(m23669e, "TSOC", c4655jo);
                    c4655jo.m23686v(m23667c);
                    return m26626e6;
                }
                if (m23669e == f28416y) {
                    zzaxn m26624c3 = m26624c(m23669e, "ITUNESADVISORY", c4655jo, false, false);
                    c4655jo.m23686v(m23667c);
                    return m26624c3;
                }
                if (m23669e == f28417z) {
                    zzaxn m26624c4 = m26624c(m23669e, "ITUNESGAPLESS", c4655jo, false, true);
                    c4655jo.m23686v(m23667c);
                    return m26624c4;
                }
                if (m23669e == f28388A) {
                    zzaxp m26626e7 = m26626e(m23669e, "TVSHOWSORT", c4655jo);
                    c4655jo.m23686v(m23667c);
                    return m26626e7;
                }
                if (m23669e == f28389B) {
                    zzaxp m26626e8 = m26626e(m23669e, "TVSHOW", c4655jo);
                    c4655jo.m23686v(m23667c);
                    return m26626e8;
                }
                if (m23669e == f28390C) {
                    String str3 = null;
                    String str4 = null;
                    int i12 = -1;
                    int i13 = -1;
                    while (c4655jo.m23667c() < m23667c) {
                        int m23667c2 = c4655jo.m23667c();
                        int m23669e3 = c4655jo.m23669e();
                        int m23669e4 = c4655jo.m23669e();
                        c4655jo.m23687w(4);
                        if (m23669e4 == AbstractC4541gk.f20628D0) {
                            str3 = c4655jo.m23679o(m23669e3 - 12);
                        } else if (m23669e4 == AbstractC4541gk.f20630E0) {
                            str4 = c4655jo.m23679o(m23669e3 - 12);
                        } else {
                            int i14 = AbstractC4541gk.f20632F0;
                            if (m23669e4 == i14) {
                                i13 = m23669e3;
                            }
                            if (m23669e4 == i14) {
                                i12 = m23667c2;
                            }
                            c4655jo.m23687w(m23669e3 - 12);
                        }
                    }
                    if ("com.apple.iTunes".equals(str3) && "iTunSMPB".equals(str4) && i12 != -1) {
                        c4655jo.m23686v(i12);
                        c4655jo.m23687w(16);
                        zzaxgVar = new zzaxl("und", str4, c4655jo.m23679o(i13 - 16));
                    }
                    return zzaxgVar;
                }
            } else {
                int i15 = 16777215 & m23669e;
                if (i15 == f28394c) {
                    int m23669e5 = c4655jo.m23669e();
                    if (c4655jo.m23669e() == AbstractC4541gk.f20632F0) {
                        c4655jo.m23687w(8);
                        String m23679o = c4655jo.m23679o(m23669e5 - 16);
                        zzaxgVar = new zzaxl("und", m23679o, m23679o);
                    } else {
                        "Failed to parse comment attribute: ".concat(AbstractC4541gk.m22462c(m23669e));
                    }
                    c4655jo.m23686v(m23667c);
                    return zzaxgVar;
                }
                if (i15 != f28392a && i15 != f28393b) {
                    if (i15 != f28399h && i15 != f28400i) {
                        if (i15 == f28395d) {
                            zzaxp m26626e9 = m26626e(m23669e, "TDRC", c4655jo);
                            c4655jo.m23686v(m23667c);
                            return m26626e9;
                        }
                        if (i15 == f28396e) {
                            zzaxp m26626e10 = m26626e(m23669e, "TPE1", c4655jo);
                            c4655jo.m23686v(m23667c);
                            return m26626e10;
                        }
                        if (i15 == f28397f) {
                            zzaxp m26626e11 = m26626e(m23669e, "TSSE", c4655jo);
                            c4655jo.m23686v(m23667c);
                            return m26626e11;
                        }
                        if (i15 == f28398g) {
                            zzaxp m26626e12 = m26626e(m23669e, "TALB", c4655jo);
                            c4655jo.m23686v(m23667c);
                            return m26626e12;
                        }
                        if (i15 == f28401j) {
                            zzaxp m26626e13 = m26626e(m23669e, "USLT", c4655jo);
                            c4655jo.m23686v(m23667c);
                            return m26626e13;
                        }
                        if (i15 == f28402k) {
                            zzaxp m26626e14 = m26626e(m23669e, "TCON", c4655jo);
                            c4655jo.m23686v(m23667c);
                            return m26626e14;
                        }
                        if (i15 == f28405n) {
                            zzaxp m26626e15 = m26626e(m23669e, "TIT1", c4655jo);
                            c4655jo.m23686v(m23667c);
                            return m26626e15;
                        }
                    }
                    zzaxp m26626e16 = m26626e(m23669e, "TCOM", c4655jo);
                    c4655jo.m23686v(m23667c);
                    return m26626e16;
                }
                zzaxp m26626e17 = m26626e(m23669e, "TIT2", c4655jo);
                c4655jo.m23686v(m23667c);
                return m26626e17;
            }
            String m22462c = AbstractC4541gk.m22462c(m23669e);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Skipped unknown metadata entry: ");
            sb3.append(m22462c);
            c4655jo.m23686v(m23667c);
            return null;
        } finally {
            c4655jo.m23686v(m23667c);
        }
    }

    /* renamed from: b */
    private static int m26623b(C4655jo c4655jo) {
        c4655jo.m23687w(4);
        if (c4655jo.m23669e() == AbstractC4541gk.f20632F0) {
            c4655jo.m23687w(8);
            return c4655jo.m23671g();
        }
        return -1;
    }

    /* renamed from: c */
    private static zzaxn m26624c(int i11, String str, C4655jo c4655jo, boolean z11, boolean z12) {
        int m26623b = m26623b(c4655jo);
        if (z12) {
            m26623b = Math.min(1, m26623b);
        }
        if (m26623b >= 0) {
            if (z11) {
                return new zzaxp(str, null, Integer.toString(m26623b));
            }
            return new zzaxl("und", str, Integer.toString(m26623b));
        }
        "Failed to parse uint8 attribute: ".concat(AbstractC4541gk.m22462c(i11));
        return null;
    }

    /* renamed from: d */
    private static zzaxp m26625d(int i11, String str, C4655jo c4655jo) {
        int m23669e = c4655jo.m23669e();
        if (c4655jo.m23669e() == AbstractC4541gk.f20632F0 && m23669e >= 22) {
            c4655jo.m23687w(10);
            int m23674j = c4655jo.m23674j();
            if (m23674j > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m23674j);
                String sb3 = sb2.toString();
                int m23674j2 = c4655jo.m23674j();
                if (m23674j2 > 0) {
                    sb3 = sb3 + "/" + m23674j2;
                }
                return new zzaxp(str, null, sb3);
            }
        }
        "Failed to parse index/count attribute: ".concat(AbstractC4541gk.m22462c(i11));
        return null;
    }

    /* renamed from: e */
    private static zzaxp m26626e(int i11, String str, C4655jo c4655jo) {
        int m23669e = c4655jo.m23669e();
        if (c4655jo.m23669e() == AbstractC4541gk.f20632F0) {
            c4655jo.m23687w(8);
            return new zzaxp(str, null, c4655jo.m23679o(m23669e - 16));
        }
        "Failed to parse text attribute: ".concat(AbstractC4541gk.m22462c(i11));
        return null;
    }
}
