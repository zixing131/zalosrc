package mn;

import com.zing.zalo.expandableview.button.CameraActionButton;
import p367nn.EnumC23888c;

/* renamed from: mn.c */
/* loaded from: classes3.dex */
public interface InterfaceC23360c {

    /* renamed from: mn.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ CameraActionButton m122816a(InterfaceC23360c interfaceC23360c, EnumC23888c enumC23888c, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    enumC23888c = null;
                }
                return interfaceC23360c.mo122815a(enumC23888c);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCameraActionButton");
        }
    }

    /* renamed from: a */
    CameraActionButton mo122815a(EnumC23888c enumC23888c);
}
