package ja0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p612wk.AbstractC29069a;
import pm0.C24848g0;

/* renamed from: ja0.t0 */
/* loaded from: classes6.dex */
public class C21186t0 extends RecyclerView.AbstractC1876c0 {
    public static final a Companion = new a(null);

    /* renamed from: J */
    private static final int f103322J = AbstractC23136l9.m118742r(48.0f);

    /* renamed from: K */
    private static final int f103323K = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: I */
    private final LinearLayout f103324I;

    /* renamed from: ja0.t0$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C21186t0(ViewGroup viewGroup) {
        super(r0);
        AbstractC19074t.m100208f(viewGroup, "parent");
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-2, f103322J));
        View view = this.f7784p;
        AbstractC19074t.m100206d(view, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout2 = (LinearLayout) view;
        this.f103324I = linearLayout2;
        linearLayout2.setOrientation(0);
        this.f7784p.setClickable(true);
        this.f7784p.setFocusable(true);
    }

    /* renamed from: i0 */
    private final void m109743i0(String str) {
        LinearLayout linearLayout = this.f103324I;
        Context context = this.f103324I.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        RobotoTextView robotoTextView = new RobotoTextView(context);
        robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        robotoTextView.setText(str);
        robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
        robotoTextView.setGravity(17);
        int i11 = f103323K;
        robotoTextView.setPadding(i11, 0, i11, 0);
        linearLayout.addView(robotoTextView);
    }

    /* renamed from: j0 */
    public final void m109744j0(AbstractC29069a abstractC29069a) {
        AbstractC29069a.x xVar;
        int i11;
        String str;
        AbstractC19074t.m100208f(abstractC29069a, "data");
        C24848g0 c24848g0 = null;
        if (abstractC29069a instanceof AbstractC29069a.x) {
            xVar = (AbstractC29069a.x) abstractC29069a;
        } else {
            xVar = null;
        }
        if (xVar != null) {
            this.f7784p.setVisibility(0);
            View view = this.f7784p;
            Context context = view.getContext();
            if (m9929A() % 2 == 0) {
                i11 = AbstractC16781w.PrimaryBackgroundColor;
            } else {
                i11 = AbstractC16781w.SecondaryBackgroundColor;
            }
            view.setBackgroundColor(C23212s8.m119607o(context, i11));
            this.f103324I.removeAllViews();
            m109743i0(String.valueOf(m9929A() + 1));
            m109743i0("Type=" + xVar.m145232e());
            int m145231d = xVar.m145231d();
            switch (xVar.m145231d()) {
                case 10:
                    str = "OPEN";
                    break;
                case 11:
                    str = "INPUT";
                    break;
                case 12:
                    str = "OUTPUT";
                    break;
                case 13:
                    str = "CLOSE";
                    break;
                case 14:
                    str = "REMOVE";
                    break;
                case 15:
                    str = "SETTING";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
            m109743i0("SubType=" + m145231d + "\n(" + str + ")");
            int m145230c = xVar.m145230c();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Source=");
            sb2.append(m145230c);
            m109743i0(sb2.toString());
            int i12 = 0;
            for (String str2 : xVar.m145229b()) {
                i12++;
                m109743i0("Param" + i12 + "=[" + str2 + "]");
            }
            c24848g0 = C24848g0.f119245a;
        }
        if (c24848g0 == null) {
            this.f7784p.setVisibility(8);
        }
    }
}
