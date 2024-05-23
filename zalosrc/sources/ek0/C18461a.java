package ek0;

import com.zing.zalo.zinstant.utils.C17195g;
import fk0.InterfaceC18988a;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ek0.a */
/* loaded from: classes.dex */
public final class C18461a {

    /* renamed from: a */
    private final InterfaceC18988a f93027a;

    public C18461a(InterfaceC18988a interfaceC18988a) {
        AbstractC19074t.m100208f(interfaceC18988a, "fileRepo");
        this.f93027a = interfaceC18988a;
    }

    /* renamed from: a */
    public final long m97792a(long j11, String str, long j12) {
        AbstractC19074t.m100208f(str, "dir");
        long mo99692a = this.f93027a.mo99692a(str);
        if (mo99692a <= j11) {
            return 0L;
        }
        long m97793b = m97793b(j12, str);
        if (mo99692a - m97793b <= j11) {
            return m97793b;
        }
        return m97793b + m97794c(j11 - j12, str);
    }

    /* renamed from: b */
    public final long m97793b(long j11, String str) {
        AbstractC19074t.m100208f(str, "dir");
        return this.f93027a.mo99694c(this.f93027a.mo99695d(str, C17195g.f87756a.m91805a()), j11);
    }

    /* renamed from: c */
    public final long m97794c(long j11, String str) {
        AbstractC19074t.m100208f(str, "dir");
        ArrayList arrayList = new ArrayList();
        List m91805a = C17195g.f87756a.m91805a();
        int size = m91805a.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(str + '/' + ((String) m91805a.get(i11)));
        }
        return this.f93027a.mo99693b(arrayList, j11);
    }
}
