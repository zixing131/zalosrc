package mn;

import android.content.Context;
import com.zing.zalo.expandableview.button.CameraActionButton;
import fn0.AbstractC19074t;
import jg0.AbstractC21248c;
import p367nn.EnumC23888c;

/* renamed from: mn.d */
/* loaded from: classes3.dex */
public final class C23361d implements InterfaceC23360c {

    /* renamed from: a */
    private final Context f113585a;

    /* renamed from: mn.d$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f113586a;

        static {
            int[] iArr = new int[EnumC23888c.values().length];
            try {
                iArr[EnumC23888c.f115486s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f113586a = iArr;
        }
    }

    public C23361d(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f113585a = context;
    }

    /* renamed from: b */
    private final Integer m122817b(EnumC23888c enumC23888c) {
        if (enumC23888c != null && a.f113586a[enumC23888c.ordinal()] == 1) {
            return Integer.valueOf(AbstractC21248c.camera_editor_action_filter);
        }
        return null;
    }

    @Override // mn.InterfaceC23360c
    /* renamed from: a */
    public CameraActionButton mo122815a(EnumC23888c enumC23888c) {
        CameraActionButton cameraActionButton = new CameraActionButton(this.f113585a, null, 0, 6, null);
        Integer m122817b = m122817b(enumC23888c);
        if (m122817b != null) {
            cameraActionButton.setId(m122817b.intValue());
        }
        return cameraActionButton;
    }
}
