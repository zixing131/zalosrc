package com.zing.zalo.zview.dialog;

import android.view.KeyEvent;

/* renamed from: com.zing.zalo.zview.dialog.d */
/* loaded from: classes7.dex */
public interface InterfaceC17463d {

    /* renamed from: com.zing.zalo.zview.dialog.d$a */
    /* loaded from: classes7.dex */
    public static class a implements d {
        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
        /* renamed from: K8 */
        public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
            if (interfaceC17463d != null) {
                try {
                    interfaceC17463d.cancel();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.zview.dialog.d$b */
    /* loaded from: classes7.dex */
    public static class b implements d {
        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
        /* renamed from: K8 */
        public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
            if (interfaceC17463d != null) {
                try {
                    interfaceC17463d.dismiss();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.zview.dialog.d$c */
    /* loaded from: classes7.dex */
    public interface c {
        /* renamed from: p7 */
        void mo13013p7(InterfaceC17463d interfaceC17463d);
    }

    /* renamed from: com.zing.zalo.zview.dialog.d$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: K8 */
        void mo605K8(InterfaceC17463d interfaceC17463d, int i11);
    }

    /* renamed from: com.zing.zalo.zview.dialog.d$e */
    /* loaded from: classes7.dex */
    public interface e {
        /* renamed from: Tv */
        void mo12457Tv(InterfaceC17463d interfaceC17463d);
    }

    /* renamed from: com.zing.zalo.zview.dialog.d$f */
    /* loaded from: classes7.dex */
    public interface f {
        /* renamed from: Tx */
        boolean mo87296Tx(InterfaceC17463d interfaceC17463d, int i11, KeyEvent keyEvent);
    }

    /* renamed from: com.zing.zalo.zview.dialog.d$g */
    /* loaded from: classes7.dex */
    public interface g {
        /* renamed from: a */
        void mo12456a(InterfaceC17463d interfaceC17463d);
    }

    /* renamed from: com.zing.zalo.zview.dialog.d$h */
    /* loaded from: classes7.dex */
    public interface h {
        /* renamed from: n7 */
        void mo92604n7();
    }

    void cancel();

    void dismiss();

    /* renamed from: f */
    int mo92862f();
}
