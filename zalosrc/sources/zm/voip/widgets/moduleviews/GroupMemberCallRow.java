package zm.voip.widgets.moduleviews;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalocore.CoreUtility;
import kd0.C21693c;
import ko0.C21789d;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import zm.voip.adapter.GroupMembersAdapter;

/* loaded from: classes7.dex */
public class GroupMemberCallRow extends ModulesView {

    /* renamed from: K */
    public C16716d f150176K;

    /* renamed from: L */
    public C22126c0 f150177L;

    /* renamed from: M */
    public C22126c0 f150178M;

    /* renamed from: N */
    public C22129e f150179N;

    /* renamed from: O */
    public C21693c f150180O;

    /* renamed from: P */
    public C21693c f150181P;

    /* renamed from: Q */
    private final Drawable f150182Q;

    /* renamed from: R */
    private final Drawable f150183R;

    /* renamed from: S */
    private final GroupMembersAdapter f150184S;

    public GroupMemberCallRow(Context context, GroupMembersAdapter groupMembersAdapter) {
        super(context);
        this.f150184S = groupMembersAdapter;
        Drawable m118665N = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_form_radio_unchecked);
        this.f150182Q = m118665N;
        this.f150183R = AbstractC23136l9.m118665N(context, AbstractC16803z.icn_form_radio_checked);
        int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.avt_M);
        m88987U(-2, -2);
        C16716d c16716d = new C16716d(context);
        this.f150176K = c16716d;
        C16718f m89106L = c16716d.m89106L();
        int i11 = AbstractC23222t7.f112540S;
        m89106L.m89028L(i11, i11);
        C22129e c22129e = new C22129e(context, m118655I);
        this.f150179N = c22129e;
        c22129e.m115441y1(C23212s8.m119609q(context, AbstractC16781w.default_avatar));
        C21693c c21693c = new C21693c(context);
        this.f150180O = c21693c;
        C16718f m89106L2 = c21693c.m89106L();
        int i12 = AbstractC23222t7.f112580q;
        C16718f m89028L = m89106L2.m89028L(i12, i12);
        Boolean bool = Boolean.TRUE;
        m89028L.m89017A(bool).m89072y(bool).m89029M(10);
        this.f150180O.m89087B0(AbstractC16803z.online_status_green_ic_with_stroke_one);
        C21693c c21693c2 = new C21693c(context);
        this.f150181P = c21693c2;
        c21693c2.mo44614b1(8);
        C16718f m89017A = this.f150181P.m89106L().m89027K(true).m89017A(bool);
        int i13 = AbstractC23222t7.f112514B;
        m89017A.m89028L(i13, i13);
        this.f150181P.mo111925v1(m118665N);
        this.f150176K.m89001g1(this.f150179N);
        this.f150176K.m89001g1(this.f150180O);
        C16716d c16716d2 = new C16716d(context);
        c16716d2.m89106L().m89028L(-1, -2).m89049e0(this.f150181P).m89054h0(this.f150176K).m89034R(AbstractC23222t7.f112586t).m89035S(AbstractC23222t7.f112566j).m89027K(true);
        C22126c0 c22126c0 = new C22126c0(context, AbstractC23136l9.m118655I(AbstractC16802y.chat_setting_item_text_size), C23212s8.m119607o(context, AbstractC21196a.TextColor1), false);
        this.f150177L = c22126c0;
        c22126c0.m89106L().m89028L(-1, -2);
        C22126c0 c22126c02 = this.f150177L;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c02.m111980v1(truncateAt);
        this.f150177L.m111953A1(1);
        C22126c0 c22126c03 = new C22126c0(context, AbstractC23136l9.m118742r(13.0f), C23212s8.m119607o(context, AbstractC21196a.TextColor2), false);
        this.f150178M = c22126c03;
        c22126c03.m89106L().m89028L(-1, -2).m89023G(this.f150177L);
        this.f150178M.m111980v1(truncateAt);
        this.f150178M.m111953A1(1);
        this.f150178M.mo44614b1(8);
        c16716d2.m89001g1(this.f150177L);
        c16716d2.m89001g1(this.f150178M);
        mo69681L(this.f150176K);
        mo69681L(this.f150181P);
        mo69681L(c16716d2);
        AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_contact_bg);
    }

    /* renamed from: V */
    public void m157444V(C21789d c21789d, boolean z11) {
        int i11;
        Drawable drawable;
        if (c21789d == null) {
            return;
        }
        try {
            int i12 = c21789d.f105759d;
            if (i12 != 0) {
                if (i12 == 3) {
                    this.f150179N.m115440x1(AbstractC16803z.ic_grouplink);
                    this.f150177L.m111959G1("Mời vào cuộc gọi nhóm bằng link");
                    this.f150177L.m111962J1(C23212s8.m119607o(getContext(), AbstractC16781w.LinkColor));
                    this.f150180O.mo44614b1(4);
                    this.f150181P.mo44614b1(8);
                    int i13 = AbstractC23222t7.f112586t;
                    setPadding(i13, i13, i13, i13);
                    return;
                }
                return;
            }
            setPadding(AbstractC23222t7.f112586t, AbstractC23222t7.f112566j, AbstractC23222t7.f112586t, AbstractC23222t7.f112566j);
            ContactProfile contactProfile = c21789d.f105756a;
            this.f150177L.m111962J1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
            if (contactProfile.f42399a1.isEmpty()) {
                this.f150177L.m111959G1(AbstractC23028c0.m118085e(contactProfile, true, AbstractC8020f0.str_you));
            } else {
                SpannableString spannableString = new SpannableString(AbstractC23028c0.m118085e(contactProfile, true, AbstractC8020f0.str_you));
                for (int i14 = 0; i14 < contactProfile.f42399a1.size() - 1; i14 += 2) {
                    if (((Integer) contactProfile.f42399a1.get(i14)).intValue() >= 0) {
                        int i15 = i14 + 1;
                        if (((Integer) contactProfile.f42399a1.get(i15)).intValue() > ((Integer) contactProfile.f42399a1.get(i14)).intValue()) {
                            spannableString.setSpan(new StyleSpan(1), ((Integer) contactProfile.f42399a1.get(i14)).intValue(), ((Integer) contactProfile.f42399a1.get(i15)).intValue(), 33);
                        }
                    }
                }
                this.f150177L.m111959G1(spannableString);
            }
            C21693c c21693c = this.f150180O;
            if (contactProfile.f42430p1) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c21693c.mo44614b1(i11);
            if (c21789d.f105757b) {
                this.f150178M.mo44614b1(0);
                this.f150178M.m111958F1(AbstractC8020f0.str_owner_role);
            } else if (c21789d.f105758c) {
                this.f150178M.mo44614b1(0);
                this.f150178M.m111958F1(AbstractC8020f0.str_admin_role);
            } else {
                this.f150178M.mo44614b1(8);
            }
            C22129e c22129e = this.f150179N;
            c22129e.f108931U0 = z11;
            c22129e.m115433q1(contactProfile);
            if (contactProfile.f42434r.equals(CoreUtility.f89233i)) {
                this.f150181P.mo44614b1(8);
                return;
            }
            this.f150181P.mo44614b1(0);
            GroupMembersAdapter groupMembersAdapter = this.f150184S;
            if (groupMembersAdapter != null) {
                C21693c c21693c2 = this.f150181P;
                if (groupMembersAdapter.f148671u.contains(contactProfile.f42434r)) {
                    drawable = this.f150183R;
                } else {
                    drawable = this.f150182Q;
                }
                c21693c2.mo111925v1(drawable);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
