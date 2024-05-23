package p056cj;

import com.zing.zalo.data.entity.chat.conversation.FirstUnreadMsg;
import dj.C17945a0;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p577vj.C28266a;

/* renamed from: cj.x */
/* loaded from: classes3.dex */
public final class C3556x {

    /* renamed from: a */
    private final List f15023a;

    /* renamed from: b */
    private final Map f15024b;

    /* renamed from: c */
    private final Map f15025c;

    /* renamed from: d */
    private final Map f15026d;

    /* renamed from: e */
    private final Map f15027e;

    /* renamed from: f */
    private final Map f15028f;

    public C3556x(List list, Map map, Map map2, Map map3, Map map4, Map map5) {
        AbstractC19074t.m100208f(list, "conversations");
        AbstractC19074t.m100208f(map, "unreadCountMap");
        AbstractC19074t.m100208f(map2, "lastMsgCountUnreadMap");
        AbstractC19074t.m100208f(map3, "firstUnreadMsgMap");
        AbstractC19074t.m100208f(map4, "unreadReactionMap");
        AbstractC19074t.m100208f(map5, "unreadMentionMap");
        this.f15023a = list;
        this.f15024b = map;
        this.f15025c = map2;
        this.f15026d = map3;
        this.f15027e = map4;
        this.f15028f = map5;
    }

    /* renamed from: a */
    public final void m18068a(List list) {
        AbstractC19074t.m100208f(list, "conversations");
        this.f15023a.addAll(list);
    }

    /* renamed from: b */
    public final List m18069b() {
        return this.f15023a;
    }

    /* renamed from: c */
    public final Map m18070c() {
        return this.f15026d;
    }

    /* renamed from: d */
    public final Map m18071d() {
        return this.f15025c;
    }

    /* renamed from: e */
    public final Map m18072e() {
        return this.f15024b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3556x)) {
            return false;
        }
        C3556x c3556x = (C3556x) obj;
        return AbstractC19074t.m100204b(this.f15023a, c3556x.f15023a) && AbstractC19074t.m100204b(this.f15024b, c3556x.f15024b) && AbstractC19074t.m100204b(this.f15025c, c3556x.f15025c) && AbstractC19074t.m100204b(this.f15026d, c3556x.f15026d) && AbstractC19074t.m100204b(this.f15027e, c3556x.f15027e) && AbstractC19074t.m100204b(this.f15028f, c3556x.f15028f);
    }

    /* renamed from: f */
    public final Map m18073f() {
        return this.f15028f;
    }

    /* renamed from: g */
    public final Map m18074g() {
        return this.f15027e;
    }

    /* renamed from: h */
    public final void m18075h(String str, FirstUnreadMsg firstUnreadMsg) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(firstUnreadMsg, "firstUnreadMsg");
        this.f15026d.put(str, firstUnreadMsg);
    }

    public int hashCode() {
        return (((((((((this.f15023a.hashCode() * 31) + this.f15024b.hashCode()) * 31) + this.f15025c.hashCode()) * 31) + this.f15026d.hashCode()) * 31) + this.f15027e.hashCode()) * 31) + this.f15028f.hashCode();
    }

    /* renamed from: i */
    public final void m18076i(String str, int i11) {
        AbstractC19074t.m100208f(str, "uid");
        this.f15025c.put(str, Integer.valueOf(i11));
    }

    /* renamed from: j */
    public final void m18077j(String str, int i11) {
        AbstractC19074t.m100208f(str, "uid");
        this.f15024b.put(str, Integer.valueOf(i11));
    }

    /* renamed from: k */
    public final void m18078k(String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "uid");
        if (c17945a0 != null) {
            this.f15028f.put(str, c17945a0);
        }
    }

    /* renamed from: l */
    public final void m18079l(String str, C28266a c28266a) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(c28266a, "unreadReaction");
        this.f15027e.put(str, c28266a);
    }

    public String toString() {
        return "TabMsgDataHolder(conversations=" + this.f15023a + ", unreadCountMap=" + this.f15024b + ", lastMsgCountUnreadMap=" + this.f15025c + ", firstUnreadMsgMap=" + this.f15026d + ", unreadReactionMap=" + this.f15027e + ", unreadMentionMap=" + this.f15028f + ")";
    }

    public C3556x() {
        this(new ArrayList(), new HashMap(), new HashMap(), new HashMap(), new HashMap(), new HashMap());
    }
}
