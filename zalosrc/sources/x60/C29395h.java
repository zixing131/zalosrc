package x60;

import android.content.Context;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zview.dialog.AbstractC17461b;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import me0.AbstractC23136l9;

/* renamed from: x60.h */
/* loaded from: classes5.dex */
public class C29395h extends AbstractC17461b {
    public C29395h(Context context, int i11, AbstractC17461b.a aVar, int i12, int i13, int i14, boolean z11) {
        super(context, i11, aVar, i12, i13, i14);
        m146571R(z11);
    }

    @Override // com.zing.zalo.zview.dialog.C17460a
    /* renamed from: N */
    public void mo92827N(int i11, CharSequence charSequence, InterfaceC17463d.d dVar) {
        if (i11 == -1) {
            try {
                charSequence = AbstractC23136l9.m118743r0(AbstractC8020f0.f43842ok);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        if (i11 == -2) {
            charSequence = AbstractC23136l9.m118743r0(AbstractC8020f0.cancel);
        }
        super.mo92827N(i11, charSequence, dVar);
    }

    /* renamed from: R */
    public void m146571R(boolean z11) {
        if (z11) {
            m92845Q().setCalendarViewShown(false);
            m92845Q().setSpinnersShown(true);
        }
    }
}
