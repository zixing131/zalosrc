package p399op;

import bo.EnumC2963d3;
import bo.EnumC3057x2;
import bo.InterfaceC2946a1;
import com.zing.zalo.feed.models.FeedMusicDataImpl;
import com.zing.zalo.feed.models.MusicDataSongInfoImpl;
import com.zing.zalo.feed.models.SongInfo;
import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p426pp.C24902e;

/* renamed from: op.b */
/* loaded from: classes4.dex */
public final class C24390b {

    /* renamed from: a */
    public static final C24390b f117764a = new C24390b();

    /* renamed from: b */
    private static final Map f117765b;

    /* renamed from: op.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends LinkedHashMap {
        a() {
        }

        /* renamed from: a */
        public /* bridge */ boolean m127576a(String str) {
            return super.containsKey(str);
        }

        /* renamed from: b */
        public /* bridge */ boolean m127577b(InterfaceC2946a1 interfaceC2946a1) {
            return super.containsValue(interfaceC2946a1);
        }

        /* renamed from: c */
        public /* bridge */ InterfaceC2946a1 m127578c(String str) {
            return (InterfaceC2946a1) super.get(str);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return m127576a((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof InterfaceC2946a1)) {
                return false;
            }
            return m127577b((InterfaceC2946a1) obj);
        }

        /* renamed from: e */
        public /* bridge */ Set m127579e() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set entrySet() {
            return m127579e();
        }

        /* renamed from: f */
        public /* bridge */ Set m127580f() {
            return super.keySet();
        }

        /* renamed from: g */
        public /* bridge */ InterfaceC2946a1 m127581g(String str, InterfaceC2946a1 interfaceC2946a1) {
            return (InterfaceC2946a1) super.getOrDefault(str, interfaceC2946a1);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return m127578c((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return m127581g((String) obj, (InterfaceC2946a1) obj2);
        }

        /* renamed from: h */
        public /* bridge */ int m127582h() {
            return super.size();
        }

        /* renamed from: i */
        public /* bridge */ Collection m127583i() {
            return super.values();
        }

        /* renamed from: k */
        public /* bridge */ InterfaceC2946a1 m127584k(String str) {
            return (InterfaceC2946a1) super.remove(str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set keySet() {
            return m127580f();
        }

        /* renamed from: l */
        public /* bridge */ boolean m127585l(String str, InterfaceC2946a1 interfaceC2946a1) {
            return super.remove(str, interfaceC2946a1);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof String) {
                return m127584k((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 300) {
                return true;
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return m127582h();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection values() {
            return m127583i();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof InterfaceC2946a1)) {
                return m127585l((String) obj, (InterfaceC2946a1) obj2);
            }
            return false;
        }
    }

    static {
        Map synchronizedMap = Collections.synchronizedMap(new a());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        f117765b = synchronizedMap;
    }

    private C24390b() {
    }

    /* renamed from: a */
    public final InterfaceC2946a1 m127570a(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        Map map = f117765b;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            AbstractC19074t.m100205c(obj);
            return (InterfaceC2946a1) obj;
        }
        return new FeedMusicDataImpl(null, str, false, new MusicDataSongInfoImpl(EnumC2963d3.f11681p, null, null, null, null, false, null, 126, null), null, null, 53, null);
    }

    /* renamed from: b */
    public final InterfaceC2946a1 m127571b(String str, SongInfo songInfo, boolean z11) {
        FeedMusicDataImpl feedMusicDataImpl;
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(songInfo, "songInfo");
        Object obj = f117765b.get(str);
        if (obj instanceof FeedMusicDataImpl) {
            feedMusicDataImpl = (FeedMusicDataImpl) obj;
        } else {
            feedMusicDataImpl = null;
        }
        if (feedMusicDataImpl == null) {
            feedMusicDataImpl = new FeedMusicDataImpl(null, null, false, null, null, null, 63, null);
            feedMusicDataImpl.m45088i(str);
            feedMusicDataImpl.mo14160c().m45111n(EnumC2963d3.f11681p);
            feedMusicDataImpl.m45089j(z11);
        }
        feedMusicDataImpl.m45090k(songInfo.m45182d());
        feedMusicDataImpl.mo14161e().m45100d(songInfo.m45181c());
        feedMusicDataImpl.mo14160c().m45107j(songInfo.m45183e());
        C24902e mo127593e = C24405q.Companion.m127651a().mo127593e(songInfo.m45182d());
        if (mo127593e != null) {
            feedMusicDataImpl.mo14160c().m45108k(mo127593e.m129494j());
            feedMusicDataImpl.mo14160c().m45106i(mo127593e.m129487c());
            feedMusicDataImpl.mo14160c().m45109l(mo127593e.m129496l());
        }
        f117764a.m127573d(feedMusicDataImpl);
        return feedMusicDataImpl;
    }

    /* renamed from: c */
    public final Map m127572c() {
        return f117765b;
    }

    /* renamed from: d */
    public final void m127573d(InterfaceC2946a1 interfaceC2946a1) {
        AbstractC19074t.m100208f(interfaceC2946a1, "feedMusicData");
        if (interfaceC2946a1.mo13947I().length() > 0 && interfaceC2946a1.mo14159b().length() > 0) {
            f117765b.put(interfaceC2946a1.mo13947I(), interfaceC2946a1);
        }
    }

    /* renamed from: e */
    public final void m127574e(EnumC3057x2 enumC3057x2) {
        AbstractC19074t.m100208f(enumC3057x2, "playBackState");
        for (InterfaceC2946a1 interfaceC2946a1 : f117765b.values()) {
            AbstractC19074t.m100206d(interfaceC2946a1, "null cannot be cast to non-null type com.zing.zalo.feed.models.FeedMusicDataImpl");
            ((FeedMusicDataImpl) interfaceC2946a1).mo14158a().m45117g(enumC3057x2);
        }
    }

    /* renamed from: f */
    public final void m127575f(boolean z11) {
        Iterator it = f117765b.entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            AbstractC19074t.m100206d(value, "null cannot be cast to non-null type com.zing.zalo.feed.models.FeedMusicDataImpl");
            ((FeedMusicDataImpl) value).mo14160c().m45110m(z11);
        }
    }
}
