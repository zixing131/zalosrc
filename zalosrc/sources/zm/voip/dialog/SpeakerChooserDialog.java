package zm.voip.dialog;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import lo0.C22621q0;
import p363nh.C23744a;
import zm.voip.dialog.SpeakerChooserDialog;
import zm.voip.service.VoipAudioHelper;

/* loaded from: classes7.dex */
public class SpeakerChooserDialog extends DialogView implements View.OnClickListener {

    /* renamed from: H0 */
    private KeyEventCallbackC17462c f148736H0 = null;

    /* renamed from: I0 */
    private int f148737I0 = 0;

    /* renamed from: J0 */
    private RelativeLayout f148738J0;

    /* renamed from: K0 */
    private RelativeLayout f148739K0;

    /* renamed from: L0 */
    private RelativeLayout f148740L0;

    /* renamed from: M0 */
    private final int f148741M0;

    public SpeakerChooserDialog() {
        C22621q0 c22621q0 = new C22621q0();
        if (c22621q0.m117000w()) {
            this.f148741M0 = 2;
        } else if (c22621q0.m116975A()) {
            this.f148741M0 = 1;
        } else {
            this.f148741M0 = 0;
        }
    }

    /* renamed from: XK */
    private void m155513XK(RelativeLayout relativeLayout) {
        if (relativeLayout == null) {
            return;
        }
        int childCount = relativeLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = relativeLayout.getChildAt(i11);
            if ((childAt instanceof ImageView) && childAt.getTag() == null) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: YK */
    private void m155514YK() {
        View inflate;
        LayoutInflater layoutInflater = (LayoutInflater) m92648SI().getSystemService("layout_inflater");
        if (layoutInflater == null) {
            return;
        }
        if (m155515ZK()) {
            inflate = layoutInflater.inflate(AbstractC7409c0.new_speaker_popup_layout_call, (ViewGroup) null);
        } else {
            inflate = layoutInflater.inflate(AbstractC7409c0.new_speaker_audio_popup_layout_call, (ViewGroup) null);
        }
        KeyEventCallbackC17462c keyEventCallbackC17462c = new KeyEventCallbackC17462c(m92648SI(), AbstractC8915g0.Call_Theme_Dialog_Translucent);
        this.f148736H0 = keyEventCallbackC17462c;
        keyEventCallbackC17462c.m92870v(1);
        this.f148736H0.m92851B(inflate);
        this.f148736H0.m92873y(true);
        this.f148736H0.m92874z(true);
        this.f148736H0.m92856G(new InterfaceC17463d.f() { // from class: no0.e
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.f
            /* renamed from: Tx */
            public final boolean mo87296Tx(InterfaceC17463d interfaceC17463d, int i11, KeyEvent keyEvent) {
                boolean m155516aL;
                m155516aL = SpeakerChooserDialog.this.m155516aL(interfaceC17463d, i11, keyEvent);
                return m155516aL;
            }
        });
        if (this.f148736H0.m92867k() != null) {
            this.f148736H0.m92867k().m92886E(0.0f);
        }
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(AbstractC6918a0.internal_speaker_group);
        this.f148738J0 = relativeLayout;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(this);
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) inflate.findViewById(AbstractC6918a0.external_speaker_group);
        this.f148739K0 = relativeLayout2;
        relativeLayout2.setOnClickListener(this);
        RelativeLayout relativeLayout3 = (RelativeLayout) inflate.findViewById(AbstractC6918a0.bluetooth_speaker_group);
        this.f148740L0 = relativeLayout3;
        relativeLayout3.setOnClickListener(this);
        int i11 = this.f148737I0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    m155517bL(this.f148738J0);
                    m155517bL(this.f148739K0);
                    m155513XK(this.f148740L0);
                }
            } else {
                m155517bL(this.f148738J0);
                m155513XK(this.f148739K0);
                m155517bL(this.f148740L0);
            }
        } else {
            m155513XK(this.f148738J0);
            m155517bL(this.f148739K0);
            m155517bL(this.f148740L0);
        }
        if (VoipAudioHelper.m155592d0()) {
            this.f148740L0.setVisibility(0);
        } else {
            this.f148740L0.setVisibility(8);
        }
    }

    /* renamed from: ZK */
    private boolean m155515ZK() {
        int i11 = this.f148741M0;
        return i11 == 1 || i11 == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aL */
    public /* synthetic */ boolean m155516aL(InterfaceC17463d interfaceC17463d, int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            this.f148736H0.dismiss();
            return true;
        }
        return true;
    }

    /* renamed from: bL */
    private void m155517bL(RelativeLayout relativeLayout) {
        if (relativeLayout == null) {
            return;
        }
        int childCount = relativeLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = relativeLayout.getChildAt(i11);
            if ((childAt instanceof ImageView) && childAt.getTag() == null) {
                childAt.setVisibility(4);
            }
        }
    }

    @Override // com.zing.zalo.zview.DialogView
    /* renamed from: LK */
    public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
        if (VoipAudioHelper.m155575V()) {
            this.f148737I0 = 2;
        } else if (!VoipAudioHelper.m155579X() && !m155515ZK()) {
            this.f148737I0 = 0;
        } else {
            this.f148737I0 = 1;
        }
        m155514YK();
        return this.f148736H0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.internal_speaker_group) {
            this.f148737I0 = 0;
            m155513XK(this.f148738J0);
            m155517bL(this.f148739K0);
            m155517bL(this.f148740L0);
        } else if (id2 == AbstractC6918a0.external_speaker_group) {
            this.f148737I0 = 1;
            m155517bL(this.f148738J0);
            m155513XK(this.f148739K0);
            m155517bL(this.f148740L0);
        } else if (id2 == AbstractC6918a0.bluetooth_speaker_group) {
            this.f148737I0 = 2;
            m155517bL(this.f148738J0);
            m155517bL(this.f148739K0);
            m155513XK(this.f148740L0);
        }
        C23744a.m124114c().m124116d(1006, 1, Integer.valueOf(this.f148737I0));
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f148736H0;
        if (keyEventCallbackC17462c != null) {
            keyEventCallbackC17462c.dismiss();
        }
    }

    public SpeakerChooserDialog(int i11) {
        this.f148741M0 = i11;
    }
}
