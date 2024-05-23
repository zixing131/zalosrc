package u80;

import com.zing.zalo.p077ui.mycloud.model.MyCloudItem;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.uidrawing.C16719g;

/* renamed from: u80.o2 */
/* loaded from: classes6.dex */
public interface InterfaceC27158o2 {

    /* renamed from: u80.o2$a */
    /* loaded from: classes6.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m139263a(InterfaceC27158o2 interfaceC27158o2, MyCloudMessageItem myCloudMessageItem, int i11, C16719g c16719g, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 4) != 0) {
                    c16719g = null;
                }
                interfaceC27158o2.mo70520c(myCloudMessageItem, i11, c16719g);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLongClickItem");
        }
    }

    /* renamed from: a */
    void mo70518a(MyCloudMessageItem myCloudMessageItem, boolean z11);

    /* renamed from: b */
    void mo70519b(MyCloudItem myCloudItem, boolean z11);

    /* renamed from: c */
    void mo70520c(MyCloudMessageItem myCloudMessageItem, int i11, C16719g c16719g);
}
