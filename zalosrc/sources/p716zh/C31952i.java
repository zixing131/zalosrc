package p716zh;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.control.InviteContactProfile;
import p712zd.InterfaceC31791d;

/* renamed from: zh.i */
/* loaded from: classes3.dex */
public class C31952i implements InterfaceC31791d {

    /* renamed from: a */
    public InviteContactProfile f146846a;

    public C31952i(InviteContactProfile inviteContactProfile) {
        this.f146846a = inviteContactProfile;
    }

    @Override // p712zd.InterfaceC31791d
    /* renamed from: a */
    public void mo152811a(LinearLayout linearLayout) {
        ((TextView) linearLayout.findViewById(AbstractC6918a0.tvdpn)).setText(this.f146846a.m40383Q(true, false));
    }
}
