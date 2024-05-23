package t80;

import android.content.Context;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;

/* renamed from: t80.j */
/* loaded from: classes6.dex */
public class C26597j extends AbstractC26593f {
    public C26597j(Context context) {
        super(context);
        C26590c c26590c = this.f125910a1;
        if (c26590c != null) {
            c26590c.mo89161z0(-1);
        }
    }

    @Override // t80.AbstractC26593f
    /* renamed from: t1 */
    boolean mo136538t1() {
        return false;
    }

    @Override // t80.AbstractC26593f
    /* renamed from: x1 */
    void mo136540x1(boolean z11) {
    }

    /* renamed from: z1 */
    public void m136549z1() {
        C22122a0 c22122a0 = this.f125907X0;
        if (c22122a0 != null) {
            c22122a0.mo89161z0(AbstractC23136l9.m118641B(c22122a0.getContext(), AbstractC16801x.story_retry_bg));
        }
        this.f125914e1.mo44614b1(0);
        C26590c c26590c = this.f125910a1;
        if (c26590c != null) {
            c26590c.m136529y1(false);
        }
        C22122a0 c22122a02 = this.f125911b1;
        if (c22122a02 != null) {
            c22122a02.m89087B0(AbstractC16803z.default_avatar);
        }
        C22126c0 c22126c0 = this.f125913d1;
        if (c22126c0 != null) {
            c22126c0.m111959G1(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_story_reload));
            this.f125913d1.mo44614b1(0);
        }
    }
}
