package bz;

import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import cp0.C17553b;
import mm0.AbstractC23350e;
import p348mi.AbstractC23309i;
import p373nx.C23956b;

/* renamed from: bz.e */
/* loaded from: classes4.dex */
public class C3160e extends AbstractC3156a implements MediaRecorder.OnErrorListener, MediaRecorder.OnInfoListener {

    /* renamed from: f */
    static final String f13356f = "e";

    /* renamed from: b */
    volatile MediaRecorder f13357b = null;

    /* renamed from: c */
    final Handler f13358c;

    /* renamed from: d */
    final HandlerThread f13359d;

    /* renamed from: e */
    C17553b f13360e;

    /* renamed from: bz.e$a */
    /* loaded from: classes4.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 1001) {
                if (i11 != 1003) {
                    if (i11 != 1007) {
                        if (i11 != 1009) {
                            if (i11 == 1010) {
                                try {
                                    if (C3160e.this.f13357b != null) {
                                        C3160e.this.m15910q();
                                        C3160e.this.f13358c.sendEmptyMessageDelayed(1010, 100L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e11) {
                                    AbstractC23350e.m122776f(C3160e.f13356f, e11);
                                    return;
                                }
                            }
                            return;
                        }
                        try {
                            C3160e.this.m15893k(message.arg1);
                            return;
                        } catch (Exception e12) {
                            AbstractC23350e.m122776f(C3160e.f13356f, e12);
                            return;
                        }
                    }
                    try {
                        C3160e.this.f13359d.getLooper().quit();
                        return;
                    } catch (Exception e13) {
                        C3160e.this.m15909p(-1, e13);
                        return;
                    }
                }
                if (C3160e.this.f13357b != null) {
                    try {
                        C3160e.this.m15910q();
                        C3160e.this.f13357b.stop();
                        try {
                            C3160e.this.f13357b.release();
                            C3160e.this.f13357b.setOnErrorListener(null);
                            C3160e.this.f13357b.setOnInfoListener(null);
                            C3160e.this.f13357b = null;
                        } catch (Exception e14) {
                            AbstractC23350e.m122776f(C3160e.f13356f, e14);
                        }
                        C3160e.this.m15887e();
                        return;
                    } catch (Exception e15) {
                        try {
                            C3160e.this.f13357b.release();
                            C3160e.this.f13357b.setOnErrorListener(null);
                            C3160e.this.f13357b.setOnInfoListener(null);
                            C3160e.this.f13357b = null;
                        } catch (Exception e16) {
                            AbstractC23350e.m122776f(C3160e.f13356f, e16);
                        }
                        C3160e.this.m15909p(-2, e15);
                        return;
                    } catch (Throwable th2) {
                        try {
                            C3160e.this.f13357b.release();
                            C3160e.this.f13357b.setOnErrorListener(null);
                            C3160e.this.f13357b.setOnInfoListener(null);
                            C3160e.this.f13357b = null;
                        } catch (Exception e17) {
                            AbstractC23350e.m122776f(C3160e.f13356f, e17);
                        }
                        C3160e.this.m15887e();
                        throw th2;
                    }
                }
                return;
            }
            try {
                if (C3160e.this.f13357b == null) {
                    C3160e.this.f13357b = new C23956b(new SensitiveData("micro_csc_voice_record", "comm_csc"));
                    C3160e.this.f13357b.setAudioSource(1);
                    if (C3160e.this.m15884b()) {
                        C3160e.this.f13357b.setOutputFormat(2);
                        C3160e.this.f13357b.setAudioEncoder(3);
                        C3160e.this.f13357b.setAudioChannels(AbstractC23309i.m121661Z());
                        C3160e.this.f13357b.setAudioEncodingBitRate(AbstractC23309i.m121217N());
                        C3160e.this.f13357b.setAudioSamplingRate(AbstractC23309i.m122051jb());
                    } else {
                        C3160e.this.f13357b.setOutputFormat(3);
                        C3160e.this.f13357b.setAudioEncoder(1);
                        C3160e.this.f13357b.setAudioSamplingRate(8000);
                        C3160e.this.f13357b.setAudioEncodingBitRate(12200);
                        C3160e.this.f13357b.setAudioChannels(1);
                    }
                    C3160e.this.f13357b.setOutputFile(C3160e.this.m15883a());
                    C3160e.this.f13357b.setOnErrorListener(C3160e.this);
                    C3160e.this.f13357b.setOnInfoListener(C3160e.this);
                    C3160e.this.f13357b.prepare();
                    C3160e.this.f13357b.start();
                    C3160e.this.m15889g();
                    C3160e.this.f13358c.sendEmptyMessage(1010);
                }
            } catch (Exception e18) {
                C3160e.this.m15909p(-1, e18);
            }
        }
    }

    public C3160e() {
        HandlerThread handlerThread = new HandlerThread("Z:StockRecorder");
        this.f13359d = handlerThread;
        handlerThread.start();
        if (this.f13360e == null) {
            this.f13360e = C17553b.m93488c(MainApplication.getAppContext());
        }
        this.f13358c = new a(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m15908o() {
        try {
            try {
                if (this.f13357b != null) {
                    try {
                        this.f13357b.stop();
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f(f13356f, e11);
                    }
                    if (this.f13357b != null) {
                        this.f13357b.release();
                    }
                }
                if (this.f13359d.getLooper() != null) {
                    try {
                        this.f13358c.sendEmptyMessage(1007);
                    } catch (Exception e12) {
                        AbstractC23350e.m122776f(f13356f, e12);
                    }
                }
            } catch (Exception e13) {
                AbstractC23350e.m122776f(f13356f, e13);
            }
        } finally {
            this.f13357b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m15909p(int i11, Exception exc) {
        m15888f(i11, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m15910q() {
        try {
            if (this.f13357b != null) {
                int maxAmplitude = this.f13357b.getMaxAmplitude();
                Message message = new Message();
                message.what = 1009;
                message.arg1 = maxAmplitude;
                this.f13358c.sendMessage(message);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f13356f, e11);
        }
    }

    @Override // bz.AbstractC3156a
    /* renamed from: d */
    public void mo15886d() {
        this.f13358c.post(new Runnable() { // from class: bz.d
            @Override // java.lang.Runnable
            public final void run() {
                C3160e.this.m15908o();
            }
        });
    }

    @Override // bz.AbstractC3156a
    /* renamed from: i */
    public void mo15891i() {
        this.f13358c.sendEmptyMessage(1001);
    }

    @Override // bz.AbstractC3156a
    /* renamed from: j */
    public void mo15892j() {
        try {
            this.f13358c.sendEmptyMessage(ZAbstractBase.ZVU_BLEND_GEN_THUMB);
        } catch (Exception e11) {
            m15909p(-1, e11);
        }
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public void onError(MediaRecorder mediaRecorder, int i11, int i12) {
        if (this.f13357b != mediaRecorder) {
            return;
        }
        m15909p(i11, new Exception("StockRecorder onError " + i11));
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public void onInfo(MediaRecorder mediaRecorder, int i11, int i12) {
        if (this.f13357b != mediaRecorder) {
            return;
        }
        m15909p(i11, new Exception("StockRecorder onInfo " + i11));
    }
}
