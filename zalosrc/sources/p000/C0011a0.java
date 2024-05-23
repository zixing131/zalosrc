package p000;

import android.widget.ImageView;
import com.zing.mp3.sdk.view.widgets.PlaybarView;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import java.util.Map;
import p156fb.InterfaceC18856b;
import pm0.C24848g0;

/* renamed from: a0 */
/* loaded from: classes2.dex */
public final class C0011a0 extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    public final /* synthetic */ PlaybarView f25q;

    /* renamed from: r */
    public final /* synthetic */ ImageView f26r;

    /* renamed from: s */
    public final /* synthetic */ String f27s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0011a0(PlaybarView playbarView, ImageView imageView, String str) {
        super(0);
        this.f25q = playbarView;
        this.f26r = imageView;
        this.f27s = str;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: V4 */
    public final Object mo12V4() {
        Map map;
        InterfaceC18856b callback = this.f25q.getCallback();
        if (callback != null) {
            callback.mo66029b(this.f26r, this.f27s);
        }
        map = this.f25q.f37601L;
        if (map != null) {
            map.put(Integer.valueOf(this.f26r.hashCode()), C31128z.f143383q);
        }
        return C24848g0.f119245a;
    }
}
