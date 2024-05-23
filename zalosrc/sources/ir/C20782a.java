package ir;

import bo.EnumC2963d3;
import com.zing.zalo.feed.models.MusicDataSongInfoImpl;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicDataImpl;
import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kr.InterfaceC21910a;
import lr.C22640a;
import p237if.C20527a;
import p399op.C24405q;
import p426pp.C24902e;

/* renamed from: ir.a */
/* loaded from: classes4.dex */
public final class C20782a {

    /* renamed from: a */
    private final Map f102137a;

    /* renamed from: ir.a$a */
    /* loaded from: classes4.dex */
    public static final class a extends LinkedHashMap {
        a() {
        }

        /* renamed from: a */
        public /* bridge */ boolean m108421a(String str) {
            return super.containsKey(str);
        }

        /* renamed from: b */
        public /* bridge */ boolean m108422b(InterfaceC21910a interfaceC21910a) {
            return super.containsValue(interfaceC21910a);
        }

        /* renamed from: c */
        public /* bridge */ InterfaceC21910a m108423c(String str) {
            return (InterfaceC21910a) super.get(str);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return m108421a((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof InterfaceC21910a)) {
                return false;
            }
            return m108422b((InterfaceC21910a) obj);
        }

        /* renamed from: e */
        public /* bridge */ Set m108424e() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set entrySet() {
            return m108424e();
        }

        /* renamed from: f */
        public /* bridge */ Set m108425f() {
            return super.keySet();
        }

        /* renamed from: g */
        public /* bridge */ InterfaceC21910a m108426g(String str, InterfaceC21910a interfaceC21910a) {
            return (InterfaceC21910a) super.getOrDefault(str, interfaceC21910a);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return m108423c((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return m108426g((String) obj, (InterfaceC21910a) obj2);
        }

        /* renamed from: h */
        public /* bridge */ int m108427h() {
            return super.size();
        }

        /* renamed from: i */
        public /* bridge */ Collection m108428i() {
            return super.values();
        }

        /* renamed from: k */
        public /* bridge */ InterfaceC21910a m108429k(String str) {
            return (InterfaceC21910a) super.remove(str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set keySet() {
            return m108425f();
        }

        /* renamed from: l */
        public /* bridge */ boolean m108430l(String str, InterfaceC21910a interfaceC21910a) {
            return super.remove(str, interfaceC21910a);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof String) {
                return m108429k((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 100) {
                return true;
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return m108427h();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection values() {
            return m108428i();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof InterfaceC21910a)) {
                return m108430l((String) obj, (InterfaceC21910a) obj2);
            }
            return false;
        }
    }

    public C20782a() {
        Map synchronizedMap = Collections.synchronizedMap(new a());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        this.f102137a = synchronizedMap;
    }

    /* renamed from: a */
    public final InterfaceC21910a m108416a(String str) {
        AbstractC19074t.m100208f(str, "storyId");
        InterfaceC21910a interfaceC21910a = (InterfaceC21910a) this.f102137a.get(str);
        if (interfaceC21910a == null) {
            return new StoryMusicDataImpl(null, str, new MusicDataSongInfoImpl(EnumC2963d3.f11681p, null, null, null, null, false, null, 126, null), null, null, 25, null);
        }
        return interfaceC21910a;
    }

    /* renamed from: b */
    public final InterfaceC21910a m108417b(String str, SongInfo songInfo, StoryMusicAttachment storyMusicAttachment) {
        StoryMusicDataImpl storyMusicDataImpl;
        AbstractC19074t.m100208f(str, "storyId");
        AbstractC19074t.m100208f(songInfo, "songInfo");
        Object obj = this.f102137a.get(str);
        if (obj instanceof StoryMusicDataImpl) {
            storyMusicDataImpl = (StoryMusicDataImpl) obj;
        } else {
            storyMusicDataImpl = null;
        }
        if (storyMusicDataImpl == null) {
            storyMusicDataImpl = new StoryMusicDataImpl(null, null, null, null, null, 31, null);
            storyMusicDataImpl.m46945j(str);
            storyMusicDataImpl.mo14160c().m45111n(EnumC2963d3.f11681p);
            storyMusicDataImpl.mo14160c().m45110m(C22640a.f111031a.m117213d());
        }
        storyMusicDataImpl.m46944i(songInfo.m45182d());
        storyMusicDataImpl.mo14161e().m46949d(songInfo.m45181c());
        storyMusicDataImpl.mo14160c().m45107j(songInfo.m45183e());
        if (storyMusicAttachment != null) {
            if (!C20527a.m106642d(storyMusicAttachment.m46924b())) {
                storyMusicAttachment.m46931i(1);
            }
            storyMusicDataImpl.mo14161e().m46951f(storyMusicAttachment);
        }
        C24902e mo127593e = C24405q.Companion.m127651a().mo127593e(songInfo.m45182d());
        if (mo127593e != null) {
            storyMusicDataImpl.mo14160c().m45108k(mo127593e.m129494j());
            storyMusicDataImpl.mo14160c().m45106i(mo127593e.m129487c());
            storyMusicDataImpl.mo14160c().m45109l(mo127593e.m129496l());
        }
        m108419d(storyMusicDataImpl);
        return storyMusicDataImpl;
    }

    /* renamed from: c */
    public final Map m108418c() {
        return this.f102137a;
    }

    /* renamed from: d */
    public final void m108419d(InterfaceC21910a interfaceC21910a) {
        AbstractC19074t.m100208f(interfaceC21910a, "storyMusicData");
        if (interfaceC21910a.mo46940d().length() > 0 && interfaceC21910a.mo14159b().length() > 0) {
            this.f102137a.put(interfaceC21910a.mo46940d(), interfaceC21910a);
        }
    }

    /* renamed from: e */
    public final void m108420e(boolean z11) {
        Iterator it = this.f102137a.entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            AbstractC19074t.m100206d(value, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.storymusic.model.StoryMusicDataImpl");
            ((StoryMusicDataImpl) value).mo14160c().m45110m(z11);
        }
    }
}
