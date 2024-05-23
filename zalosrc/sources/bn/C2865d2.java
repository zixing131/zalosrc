package bn;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zview.dialog.AbstractC17464e;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import me0.AbstractC23136l9;
import p348mi.AbstractC23309i;

/* renamed from: bn.d2 */
/* loaded from: classes3.dex */
public class C2865d2 extends KeyEventCallbackC17462c {

    /* renamed from: bn.d2$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private final Context f11426a;

        /* renamed from: b */
        InterfaceC17463d.d f11427b;

        /* renamed from: c */
        InterfaceC17463d.d f11428c;

        public a(Context context) {
            this.f11426a = context;
        }

        /* renamed from: a */
        public C2865d2 m13798a() {
            LayoutInflater layoutInflater = (LayoutInflater) this.f11426a.getSystemService("layout_inflater");
            C2865d2 c2865d2 = new C2865d2(this.f11426a, AbstractC8915g0.Dialog_Fullscreen);
            c2865d2.m92870v(1);
            View inflate = layoutInflater.inflate(AbstractC7409c0.update_phonebook_dialog, (ViewGroup) null);
            RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_title);
            RobotoTextView robotoTextView2 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_subtitle);
            RobotoTextView robotoTextView3 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.btnConfirmPhoneBookYes);
            RobotoTextView robotoTextView4 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.btnConfirmPhoneBookNo);
            RobotoTextView robotoTextView5 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.btnConfirmPhonebookNoType2);
            if (AbstractC23309i.m122123l8()) {
                robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_updatephonebook_des1));
                robotoTextView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_updatephonebook_des2));
                robotoTextView2.setVisibility(0);
                robotoTextView4.setVisibility(8);
                robotoTextView5.setVisibility(0);
                robotoTextView4 = robotoTextView5;
            } else {
                robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_phone_reminder_title_remind_old_device_fullscreen));
                robotoTextView4.setText(Html.fromHtml(AbstractC23136l9.m118743r0(AbstractC8020f0.str_phome_reminder_action_no_2)));
                robotoTextView2.setVisibility(8);
                robotoTextView4.setVisibility(0);
                robotoTextView5.setVisibility(8);
            }
            c2865d2.m92867k().m92889H(-1, -1);
            InterfaceC17463d.d dVar = this.f11427b;
            if (dVar != null) {
                AbstractC17464e.m92876b(robotoTextView3, c2865d2, dVar, -1);
            }
            InterfaceC17463d.d dVar2 = this.f11428c;
            if (dVar2 != null) {
                AbstractC17464e.m92876b(robotoTextView4, c2865d2, dVar2, -2);
            }
            c2865d2.m92851B(inflate);
            c2865d2.m92873y(false);
            return c2865d2;
        }

        /* renamed from: b */
        public a m13799b(InterfaceC17463d.d dVar) {
            this.f11428c = dVar;
            return this;
        }

        /* renamed from: c */
        public a m13800c(InterfaceC17463d.d dVar) {
            this.f11427b = dVar;
            return this;
        }
    }

    public C2865d2(Context context, int i11) {
        super(context, i11);
    }
}
