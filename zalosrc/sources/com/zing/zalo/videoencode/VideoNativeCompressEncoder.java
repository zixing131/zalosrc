package com.zing.zalo.videoencode;

import androidx.annotation.Keep;
import com.zing.zalo.config.VideoNativeCompressConfig;
import com.zing.zalo.videoencode.exception.VideoEncoderException;
import com.zing.zalo.zvideotranscode.ZVideoTranscode;
import gf0.C19436a;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class VideoNativeCompressEncoder extends AbstractC16778c {

    /* renamed from: v */
    private int f85105v;

    public VideoNativeCompressEncoder(C19436a c19436a) {
        super(c19436a);
        this.f85105v = -1;
    }

    @Keep
    private void onVideoTranscodeCallback(String str, int i11, int i12, int i13) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    int i14 = i12 / 1000;
                    if (this.f85126o.m101610d() != null) {
                        this.f85126o.m101610d().mo50435a(i14);
                    }
                    if (i14 % 10 == 0) {
                        m89565k(String.format("[VNCE] progressing: %s", Integer.valueOf(i14)));
                        return;
                    }
                    return;
                }
                return;
            }
            this.f85105v = i12;
            m89565k(String.format(Locale.US, "[VNCE] error:%d, msg:%s", Integer.valueOf(i12), str));
            return;
        }
        this.f85105v = 0;
        m89565k("[VNCE] transcode done");
    }

    @Override // com.zing.zalo.videoencode.AbstractC16778c
    /* renamed from: a */
    public int mo89540a() {
        int i11;
        m89570r(this.f85126o.m101622p(), this.f85126o.m101621o());
        m89571s(this.f85126o.m101613g());
        m89569q(this.f85126o.m101620n());
        int i12 = 0;
        try {
            RunnableC16779d.m89572a(this);
        } catch (Throwable th2) {
            if (th2 instanceof VideoEncoderException) {
                i11 = th2.m89617a();
            } else {
                i11 = -1;
            }
            m89565k(String.format(Locale.US, "[VNCE] Exception: error:%s, msg:%s", Integer.valueOf(i11), th2.getMessage()));
            i12 = i11;
        }
        m89566l(16301, null, i12);
        return i12;
    }

    @Override // com.zing.zalo.videoencode.AbstractC16778c
    /* renamed from: d */
    public void mo89541d() {
        Object obj;
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        m89565k("[VNCE] Start transcode");
        if (this.f85126o.m101610d() != null) {
            this.f85126o.m101610d().mo50440f(1);
        }
        VideoNativeCompressConfig m101617k = this.f85126o.m101617k();
        String m40334h = m101617k.m40334h();
        String m40328a = m101617k.m40328a();
        String m40333g = m101617k.m40333g();
        String m40332f = m101617k.m40332f();
        String m40330c = m101617k.m40330c();
        if (this.f85126o.m101632z()) {
            m40328a = "4000000";
            m40333g = "high";
            m40332f = "fast";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("src", this.f85126o.m101613g());
        jSONObject.put("dst", this.f85126o.m101620n());
        jSONObject.put("width", "0");
        jSONObject.put("height", "0");
        jSONObject.put("resolution", m40334h);
        jSONObject.put("bitrate", m40328a);
        jSONObject.put("framerate", m40330c);
        jSONObject.put("profile", m40333g);
        jSONObject.put("preset", m40332f);
        jSONObject.put("startTime", String.valueOf(this.f85126o.m101626t()));
        jSONObject.put("duration", String.valueOf(this.f85126o.m101625s()));
        jSONObject.put("maxSize", "104857600");
        String str = "true";
        if (this.f85126o.m101631y() || this.f85126o.m101632z()) {
            obj = "true";
        } else {
            obj = "false";
        }
        jSONObject.put("muteAudio", obj);
        if (!this.f85126o.m101632z()) {
            str = "false";
        }
        jSONObject.put("forceI", str);
        ZVideoTranscode.setSrc(this.f85126o.m101613g());
        ZVideoTranscode.setDst(this.f85126o.m101620n());
        ZVideoTranscode.setWidth(0);
        ZVideoTranscode.setHeight(0);
        ZVideoTranscode.setResolution(m40334h);
        ZVideoTranscode.setBitrate(Integer.parseInt(m40328a));
        ZVideoTranscode.setFramerate(Double.parseDouble(m40330c));
        ZVideoTranscode.setProfile(m40333g);
        ZVideoTranscode.setPreset(m40332f);
        ZVideoTranscode.setStartTime(this.f85126o.m101626t());
        ZVideoTranscode.setDuration(this.f85126o.m101625s());
        ZVideoTranscode.setMaxSize(104857600);
        if (!this.f85126o.m101631y() && !this.f85126o.m101632z()) {
            z11 = false;
        } else {
            z11 = true;
        }
        ZVideoTranscode.setMuteAudio(z11);
        ZVideoTranscode.setForceI(this.f85126o.m101632z());
        m89565k("[VNCE] Transcode config: " + jSONObject);
        ZVideoTranscode.m92591a();
        ZVideoTranscode.transcodeVideo("", this, "onVideoTranscodeCallback", false);
        if (this.f85105v == 0) {
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            m89565k(String.format(Locale.US, "[VNCE] Encode time: %s (millisecond)", Long.valueOf(currentTimeMillis2)));
            long m101625s = this.f85126o.m101625s();
            if (m101625s == 0) {
                m101625s = this.f85126o.m101628v() * 1000;
            }
            m89564j(currentTimeMillis2, m101625s, 16305);
            return;
        }
        throw new VideoEncoderException(this.f85105v, new IllegalStateException("Crash!!! Something's wrong."));
    }
}
