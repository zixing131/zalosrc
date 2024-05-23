package zm.voip.widgets.moduleviews;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import gp0.C19532a;
import gp0.C19577z;
import jo0.C21333k;
import kd0.C21693c;
import ko0.C21790e;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23022b5;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23055e5;
import me0.C23212s8;
import s30.AbstractC26125a;
import zm.voip.widgets.moduleviews.InviteMemberCallRow;

/* loaded from: classes7.dex */
public class InviteMemberCallRow extends ModulesView {

    /* renamed from: K */
    public C22126c0 f150185K;

    /* renamed from: L */
    public C22129e f150186L;

    /* renamed from: M */
    public C22126c0 f150187M;

    /* renamed from: N */
    public C21693c f150188N;

    /* renamed from: O */
    private final C21333k f150189O;

    public InviteMemberCallRow(Context context, C21333k c21333k) {
        super(context);
        m88987U(-2, -2);
        setPadding(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(6.0f));
        this.f150189O = c21333k;
        C22129e c22129e = new C22129e(context, AbstractC23136l9.m118655I(AbstractC16802y.avt_M));
        this.f150186L = c22129e;
        C16718f m89027K = c22129e.m89106L().m89027K(true);
        Boolean bool = Boolean.TRUE;
        m89027K.m89073z(bool);
        this.f150186L.m115441y1(C23212s8.m119609q(context, AbstractC16781w.default_avatar));
        C21693c c21693c = new C21693c(context);
        this.f150188N = c21693c;
        C16718f m89106L = c21693c.m89106L();
        int i11 = AbstractC23222t7.f112580q;
        m89106L.m89028L(i11, i11).m89019C(this.f150186L).m89067t(this.f150186L);
        this.f150188N.mo44614b1(8);
        this.f150188N.m89087B0(AbstractC16803z.online_status_green_ic_with_stroke_one);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f150187M = c22126c0;
        c22126c0.m89106L().m89028L(AbstractC23136l9.m118742r(100.0f), -2).m89027K(true).m89017A(bool).m89042Z(AbstractC23136l9.m118742r(16.0f), 0, AbstractC23136l9.m118742r(16.0f), 0).m89029M(15);
        C22126c0 c22126c02 = this.f150187M;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c02.m111980v1(truncateAt);
        this.f150187M.m111953A1(1);
        AbstractC23022b5.m118023a(this.f150187M, AbstractC8915g0.btnCallType3);
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89028L(-1, -2).m89049e0(this.f150187M).m89054h0(this.f150186L).m89034R(AbstractC23136l9.m118742r(16.0f)).m89035S(AbstractC23136l9.m118742r(8.0f)).m89027K(true);
        C22126c0 c22126c03 = new C22126c0(context);
        this.f150185K = c22126c03;
        c22126c03.m89106L().m89028L(-1, -2);
        this.f150185K.m111980v1(truncateAt);
        this.f150185K.m111953A1(1);
        this.f150185K.m111962J1(AbstractC23136l9.m118641B(context, AbstractC26125a.ND300_old));
        this.f150185K.mo111964L1(AbstractC23136l9.m118742r(16.0f));
        c16716d.m89001g1(this.f150185K);
        mo69681L(this.f150186L);
        mo69681L(this.f150188N);
        mo69681L(this.f150187M);
        mo69681L(c16716d);
        AbstractC23136l9.m118699c1(this, Color.parseColor("#00000000"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m157446X(ContactProfile contactProfile, C21790e c21790e, C16719g c16719g) {
        if (!C23055e5.m118272g(true)) {
            return;
        }
        if (C19577z.m102341J().m102407a0().size() + 1 < C19577z.m102341J().m102390R()) {
            C19577z.m102341J().m102361B0(new C19532a("[\"" + contactProfile.f42434r + "\"]", 456));
            this.f150187M.mo89099H0(false);
            this.f150189O.m110464O().put(Integer.valueOf(Integer.parseInt(c21790e.f105768e)), c21790e);
            return;
        }
        this.f150189O.m110470U(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_groupcall_full_member_toast));
    }

    /* renamed from: W */
    public void m157447W(final C21790e c21790e, boolean z11) {
        int i11;
        if (c21790e == null) {
            return;
        }
        try {
            final ContactProfile contactProfile = c21790e.f105764a;
            if (contactProfile.f42399a1.isEmpty()) {
                this.f150185K.m111959G1(AbstractC23028c0.m118085e(contactProfile, true, AbstractC8020f0.str_you));
            } else {
                SpannableString spannableString = new SpannableString(AbstractC23028c0.m118085e(contactProfile, true, AbstractC8020f0.str_you));
                for (int i12 = 0; i12 < contactProfile.f42399a1.size() - 1; i12 += 2) {
                    if (((Integer) contactProfile.f42399a1.get(i12)).intValue() >= 0) {
                        int i13 = i12 + 1;
                        if (((Integer) contactProfile.f42399a1.get(i13)).intValue() > ((Integer) contactProfile.f42399a1.get(i12)).intValue()) {
                            spannableString.setSpan(new StyleSpan(1), ((Integer) contactProfile.f42399a1.get(i12)).intValue(), ((Integer) contactProfile.f42399a1.get(i13)).intValue(), 33);
                        }
                    }
                }
                this.f150185K.m111959G1(spannableString);
            }
            C21693c c21693c = this.f150188N;
            if (contactProfile.f42430p1) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c21693c.mo44614b1(i11);
            C22129e c22129e = this.f150186L;
            c22129e.f108931U0 = z11;
            c22129e.m115433q1(contactProfile);
            this.f150187M.mo89109M0(new C16719g.c() { // from class: fp0.c
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    InviteMemberCallRow.this.m157446X(contactProfile, c21790e, c16719g);
                }
            });
            if (!c21790e.m112455c() && !this.f150189O.m110463N().contains(Integer.valueOf(Integer.parseInt(c21790e.f105768e))) && !this.f150189O.m110464O().containsKey(Integer.valueOf(Integer.parseInt(c21790e.f105768e)))) {
                this.f150187M.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_add_partner_button));
                this.f150187M.mo89099H0(true);
                return;
            }
            if (c21790e.m112453a() == 3) {
                this.f150187M.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_incall_partner_status));
            } else if (c21790e.m112453a() == 4) {
                this.f150187M.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.call_state_disconnected));
            } else if (c21790e.m112453a() == -1) {
                this.f150187M.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_add_partner_button));
            } else {
                this.f150187M.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_handshake_partner_status));
            }
            this.f150187M.mo89099H0(false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
