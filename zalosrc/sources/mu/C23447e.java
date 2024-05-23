package mu;

import android.text.TextUtils;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import nu.C23941g;
import nu.C23943i;
import nu.C23945k;
import org.json.JSONException;
import org.json.JSONObject;
import p428pu.AbstractC24910b;

/* renamed from: mu.e */
/* loaded from: classes.dex */
public class C23447e {

    /* renamed from: b */
    private static C23447e f113896b;

    /* renamed from: a */
    public HashMap f113897a;

    private C23447e() {
        m123131b();
    }

    /* renamed from: a */
    public static C23447e m123130a() {
        if (f113896b == null) {
            f113896b = new C23447e();
        }
        return f113896b;
    }

    /* renamed from: b */
    public void m123131b() {
        JSONObject jSONObject;
        this.f113897a = new HashMap();
        String m123111g = C23444b.m123111g();
        try {
            if (TextUtils.isEmpty(m123111g)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(m123111g);
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.f113897a.put(next, (Integer) jSONObject.get(next));
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020a, code lost:            if (r1 < r3) goto L261;     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x022c, code lost:            if (r1 < r3) goto L269;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C23943i m123132c(C23943i c23943i, int i11) {
        int i12;
        long j11;
        long j12;
        long m129571b;
        long m129571b2;
        long j13;
        long timeInMillis;
        int i13;
        long j14;
        long j15;
        int i14;
        long j16;
        long j17;
        char c11;
        int i15 = c23943i.f115913i;
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        if (i11 == 0) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        if (i15 != 501) {
            if (i15 != 502) {
                int i16 = 7;
                switch (i15) {
                    case 1:
                        c23943i.mo125303e(1, i12);
                        break;
                    case 2:
                        c23943i.mo125303e(2, i12);
                        break;
                    case 3:
                        c23943i.mo125303e(3, i12);
                        break;
                    case 4:
                        c23943i.mo125303e(4, i12);
                        break;
                    case 5:
                        c23943i.mo125303e(5, i12);
                        break;
                    case 6:
                        c23943i.mo125303e(6, i12);
                        break;
                    case 7:
                        c23943i.mo125303e(7, i12);
                        break;
                    default:
                        switch (i15) {
                            case 101:
                                c23943i.f115911g = currentTimeMillis;
                                c23943i.f115912h = currentTimeMillis;
                                C23941g c23941g = (C23941g) c23943i;
                                c23941g.f115899n = false;
                                c23941g.f115900o = 2;
                                break;
                            case 102:
                                calendar.add(5, 1);
                                long timeInMillis2 = calendar.getTimeInMillis();
                                c23943i.f115911g = timeInMillis2;
                                c23943i.f115912h = timeInMillis2;
                                C23941g c23941g2 = (C23941g) c23943i;
                                c23941g2.f115899n = false;
                                c23941g2.f115900o = 2;
                                break;
                            case 103:
                                calendar.add(5, 2);
                                long timeInMillis3 = calendar.getTimeInMillis();
                                c23943i.f115911g = timeInMillis3;
                                c23943i.f115912h = timeInMillis3;
                                C23941g c23941g3 = (C23941g) c23943i;
                                c23941g3.f115899n = false;
                                c23941g3.f115900o = 2;
                                break;
                            case 104:
                                calendar.add(5, -1);
                                long timeInMillis4 = calendar.getTimeInMillis();
                                c23943i.f115911g = timeInMillis4;
                                c23943i.f115912h = timeInMillis4;
                                C23941g c23941g4 = (C23941g) c23943i;
                                c23941g4.f115899n = false;
                                c23941g4.f115900o = 2;
                                break;
                            case 105:
                                if (i11 == 0) {
                                    currentTimeMillis = AbstractC24910b.m129571b(6, i12);
                                    ((C23941g) c23943i).f115900o = 3;
                                } else if (i11 == 1) {
                                    currentTimeMillis = AbstractC24910b.m129571b(7, i12);
                                    m129571b = AbstractC24910b.m129571b(1, i12);
                                    break;
                                }
                                m129571b = currentTimeMillis;
                                c23943i.f115911g = currentTimeMillis;
                                c23943i.f115912h = m129571b;
                                break;
                            default:
                                switch (i15) {
                                    case 107:
                                        if (i11 == 0) {
                                            currentTimeMillis = AbstractC24910b.m129571b(2, i12);
                                            ((C23941g) c23943i).f115900o = 3;
                                        } else if (i11 == 1) {
                                            currentTimeMillis = AbstractC24910b.m129571b(2, i12);
                                            m129571b2 = AbstractC24910b.m129571b(3, i12);
                                            break;
                                        }
                                        m129571b2 = currentTimeMillis;
                                        c23943i.f115911g = currentTimeMillis;
                                        c23943i.f115912h = m129571b2;
                                        break;
                                    case 108:
                                        if (i11 == 0) {
                                            calendar.setTimeInMillis(currentTimeMillis);
                                            if (calendar.get(7) == 1) {
                                                i13 = 0;
                                            } else {
                                                i13 = 8 - calendar.get(7);
                                            }
                                            calendar.add(5, i13);
                                            currentTimeMillis = calendar.getTimeInMillis();
                                            calendar.add(5, -6);
                                            timeInMillis = calendar.getTimeInMillis();
                                            ((C23941g) c23943i).f115900o = 1;
                                        } else if (i11 == 1) {
                                            calendar.setTimeInMillis(currentTimeMillis);
                                            if (calendar.get(7) == 1) {
                                                calendar.add(5, -6);
                                            } else {
                                                calendar.set(7, 2);
                                            }
                                            timeInMillis = calendar.getTimeInMillis();
                                        } else {
                                            j13 = currentTimeMillis;
                                            c23943i.f115911g = currentTimeMillis;
                                            c23943i.f115912h = j13;
                                            break;
                                        }
                                        long j18 = timeInMillis;
                                        j13 = currentTimeMillis;
                                        currentTimeMillis = j18;
                                        c23943i.f115911g = currentTimeMillis;
                                        c23943i.f115912h = j13;
                                    case 109:
                                        if (i11 == 0) {
                                            ((C23941g) c23943i).f115900o = 1;
                                            j14 = -1;
                                            currentTimeMillis = -1;
                                        } else if (i11 == 1) {
                                            calendar.setTimeInMillis(currentTimeMillis);
                                            if (calendar.get(7) != 1) {
                                                i16 = calendar.get(7) - 1;
                                            }
                                            calendar.add(5, -i16);
                                            long timeInMillis5 = calendar.getTimeInMillis();
                                            calendar.add(5, -6);
                                            j14 = timeInMillis5;
                                            currentTimeMillis = calendar.getTimeInMillis();
                                        } else {
                                            j14 = currentTimeMillis;
                                        }
                                        c23943i.f115911g = currentTimeMillis;
                                        c23943i.f115912h = j14;
                                        break;
                                    case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10 /* 110 */:
                                        if (i11 == 0) {
                                            calendar.setTimeInMillis(currentTimeMillis);
                                            if (calendar.get(7) == 1) {
                                                i14 = 1;
                                            } else {
                                                i14 = 8 - calendar.get(7);
                                            }
                                            calendar.add(5, i14);
                                            currentTimeMillis = calendar.getTimeInMillis();
                                            calendar.add(5, 6);
                                            j15 = calendar.getTimeInMillis();
                                            ((C23941g) c23943i).f115900o = 1;
                                        } else if (i11 == 1) {
                                            j15 = -1;
                                            currentTimeMillis = -1;
                                        } else {
                                            j15 = currentTimeMillis;
                                        }
                                        c23943i.f115911g = currentTimeMillis;
                                        c23943i.f115912h = j15;
                                        break;
                                    case 111:
                                        if (i11 == 0) {
                                            j16 = -1;
                                            currentTimeMillis = -1;
                                        } else if (i11 == 1) {
                                            calendar.setTimeInMillis(currentTimeMillis);
                                            calendar.add(5, -calendar.get(5));
                                            long timeInMillis6 = calendar.getTimeInMillis();
                                            calendar.set(5, 1);
                                            j16 = timeInMillis6;
                                            currentTimeMillis = calendar.getTimeInMillis();
                                        } else {
                                            j16 = currentTimeMillis;
                                        }
                                        c23943i.f115911g = currentTimeMillis;
                                        c23943i.f115912h = j16;
                                        break;
                                    case 112:
                                        if (i11 == 0) {
                                            j17 = -1;
                                            currentTimeMillis = -1;
                                        } else if (i11 == 1) {
                                            calendar.setTimeInMillis(currentTimeMillis);
                                            long timeInMillis7 = calendar.getTimeInMillis();
                                            calendar.set(5, 1);
                                            j17 = timeInMillis7;
                                            currentTimeMillis = calendar.getTimeInMillis();
                                        } else {
                                            j17 = currentTimeMillis;
                                        }
                                        c23943i.f115911g = currentTimeMillis;
                                        c23943i.f115912h = j17;
                                        break;
                                    default:
                                        switch (i15) {
                                            case 301:
                                                c23943i.mo125303e(0, i12);
                                                break;
                                            case 302:
                                                c23943i.mo125303e(1, i12);
                                                break;
                                            case 303:
                                                c23943i.mo125303e(2, i12);
                                                break;
                                            case 304:
                                                c23943i.mo125303e(3, i12);
                                                break;
                                            case 305:
                                                c23943i.mo125303e(4, i12);
                                                break;
                                            case 306:
                                                c23943i.mo125303e(5, i12);
                                                break;
                                            case 307:
                                                c23943i.mo125303e(6, i12);
                                                break;
                                            case 308:
                                                c23943i.mo125303e(7, i12);
                                                break;
                                            case 309:
                                                c23943i.mo125303e(8, i12);
                                                break;
                                            case 310:
                                                c23943i.mo125303e(9, i12);
                                                break;
                                            case 311:
                                                c23943i.mo125303e(10, i12);
                                                break;
                                            case 312:
                                                c23943i.mo125303e(11, i12);
                                                break;
                                            default:
                                                switch (i15) {
                                                    case 400:
                                                        c23943i.mo125299d(1);
                                                        break;
                                                    case 401:
                                                        c23943i.mo125299d(2);
                                                        break;
                                                    case 402:
                                                        c23943i.mo125299d(3);
                                                        break;
                                                    case 403:
                                                        c23943i.mo125299d(4);
                                                        break;
                                                    case 404:
                                                        c23943i.mo125299d(5);
                                                        break;
                                                    default:
                                                        String str = c23943i.f115905a;
                                                        str.hashCode();
                                                        switch (str.hashCode()) {
                                                            case -1349088399:
                                                                if (str.equals("custom")) {
                                                                    c11 = 0;
                                                                    break;
                                                                }
                                                                c11 = 65535;
                                                                break;
                                                            case -1313927333:
                                                                if (str.equals("time_en")) {
                                                                    c11 = 1;
                                                                    break;
                                                                }
                                                                c11 = 65535;
                                                                break;
                                                            case -1313926806:
                                                                if (str.equals("time_vn")) {
                                                                    c11 = 2;
                                                                    break;
                                                                }
                                                                c11 = 65535;
                                                                break;
                                                            case -1296587797:
                                                                if (str.equals("year_en")) {
                                                                    c11 = 3;
                                                                    break;
                                                                }
                                                                c11 = 65535;
                                                                break;
                                                            case -1296587270:
                                                                if (str.equals("year_vn")) {
                                                                    c11 = 4;
                                                                    break;
                                                                }
                                                                c11 = 65535;
                                                                break;
                                                            default:
                                                                c11 = 65535;
                                                                break;
                                                        }
                                                        switch (c11) {
                                                            case 0:
                                                                c23943i.mo125299d(i12);
                                                                break;
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                                c23943i.mo125316c();
                                                                break;
                                                        }
                                                }
                                        }
                                }
                                break;
                        }
                }
            } else {
                if (i11 == 0) {
                    j12 = -1;
                    currentTimeMillis = -1;
                } else if (i11 == 1) {
                    calendar.setTimeInMillis(currentTimeMillis);
                    calendar.add(1, -1);
                    calendar.set(2, 0);
                    calendar.set(5, 1);
                    currentTimeMillis = calendar.getTimeInMillis();
                    calendar.set(2, 11);
                    calendar.set(5, 31);
                    j12 = calendar.getTimeInMillis();
                    ((C23945k) c23943i).f115918m = calendar.get(1);
                } else {
                    j12 = currentTimeMillis;
                }
                c23943i.f115911g = currentTimeMillis;
                c23943i.f115912h = j12;
            }
        } else {
            if (i11 == 0) {
                j11 = -1;
                currentTimeMillis = -1;
            } else if (i11 == 1) {
                calendar.setTimeInMillis(currentTimeMillis);
                calendar.set(2, 0);
                calendar.set(5, 1);
                currentTimeMillis = calendar.getTimeInMillis();
                calendar.set(2, 11);
                calendar.set(5, 31);
                j11 = calendar.getTimeInMillis();
                ((C23945k) c23943i).f115918m = calendar.get(1);
            } else {
                j11 = currentTimeMillis;
            }
            c23943i.f115911g = currentTimeMillis;
            c23943i.f115912h = j11;
        }
        c23943i.f115914j = AbstractC24910b.m129570a(c23943i.f115911g, "dd/MM/yyyy HH:mm");
        c23943i.f115915k = AbstractC24910b.m129570a(c23943i.f115912h, "dd/MM/yyyy HH:mm");
        return c23943i;
    }
}
