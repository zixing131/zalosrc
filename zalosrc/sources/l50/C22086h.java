package l50;

import com.zing.zalo.p077ui.call.settingringtone.presenter.data.RingtoneData;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import i50.C20304a;
import p185gc.AbstractC19381e;

/* renamed from: l50.h */
/* loaded from: classes5.dex */
public final class C22086h extends AbstractC19381e {

    /* renamed from: a */
    private final C20304a f108704a;

    public C22086h() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19381e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public RingtoneData mo93498b() {
        return this.f108704a.m105995r();
    }

    public C22086h(C20304a c20304a) {
        AbstractC19074t.m100208f(c20304a, "repo");
        this.f108704a = c20304a;
    }

    public /* synthetic */ C22086h(C20304a c20304a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C20304a.Companion.m106001a() : c20304a);
    }
}
