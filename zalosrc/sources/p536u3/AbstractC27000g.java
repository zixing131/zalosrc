package p536u3;

import android.graphics.Color;
import android.graphics.Paint;
import android.util.JsonReader;
import java.util.Locale;
import p566v3.C27501i;
import p566v3.C27502j;

/* renamed from: u3.g */
/* loaded from: classes2.dex */
public abstract class AbstractC27000g {

    /* renamed from: a */
    static final AbstractC26994a f127646a = new a();

    /* renamed from: u3.g$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC26994a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p536u3.AbstractC26994a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C27502j mo139107b(JsonReader jsonReader) {
            return AbstractC27000g.m139124a(jsonReader);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00cd A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C27502j m139124a(JsonReader jsonReader) {
        jsonReader.beginObject();
        C27502j.a aVar = new C27502j.a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1923169788:
                    if (nextName.equals("animation_group")) {
                        c11 = 0;
                    }
                    switch (c11) {
                        case 0:
                            aVar.f129382i = jsonReader.nextInt();
                            break;
                        case 1:
                            aVar.f129387n = AbstractC27001h.m139126a(jsonReader);
                            break;
                        case 2:
                            aVar.f129378e = (float) jsonReader.nextDouble();
                            break;
                        case 3:
                            aVar.f129381h = AbstractC26995b.m139110c(jsonReader);
                            break;
                        case 4:
                            aVar.f129379f = (float) jsonReader.nextDouble();
                            break;
                        case 5:
                            aVar.f129376c = Color.parseColor(jsonReader.nextString());
                            break;
                        case 6:
                            aVar.f129375b = Color.parseColor(jsonReader.nextString());
                            break;
                        case 7:
                            aVar.f129377d = (float) jsonReader.nextDouble();
                            break;
                        case '\b':
                            aVar.f129374a = jsonReader.nextString();
                            break;
                        case '\t':
                            aVar.f129380g = AbstractC27002i.f127647a.m139106a(jsonReader);
                            break;
                        case '\n':
                            aVar.f129388o = jsonReader.nextString();
                            break;
                        case 11:
                            aVar.f129385l = AbstractC26996c.f127642a.m139106a(jsonReader);
                            break;
                        case '\f':
                            aVar.f129383j = Paint.Cap.valueOf(jsonReader.nextString().toUpperCase(Locale.US));
                            break;
                        case '\r':
                            aVar.f129384k = m139124a(jsonReader);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                case -1833928446:
                    if (nextName.equals("effects")) {
                        c11 = 1;
                    }
                    switch (c11) {
                    }
                    break;
                case -1806353256:
                    if (nextName.equals("from_frame")) {
                        c11 = 2;
                    }
                    switch (c11) {
                    }
                    break;
                case -1530780935:
                    if (nextName.equals("timing_curves")) {
                        c11 = 3;
                    }
                    switch (c11) {
                    }
                    break;
                case -1446309207:
                    if (nextName.equals("to_frame")) {
                        c11 = 4;
                    }
                    switch (c11) {
                    }
                    break;
                case -259686756:
                    if (nextName.equals("stroke_color")) {
                        c11 = 5;
                    }
                    switch (c11) {
                    }
                    break;
                case -247981657:
                    if (nextName.equals("fill_color")) {
                        c11 = 6;
                    }
                    switch (c11) {
                    }
                    break;
                case -241402625:
                    if (nextName.equals("stroke_width")) {
                        c11 = 7;
                    }
                    switch (c11) {
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c11 = '\b';
                    }
                    switch (c11) {
                    }
                    break;
                case 152226438:
                    if (nextName.equals("key_frames")) {
                        c11 = '\t';
                    }
                    switch (c11) {
                    }
                    break;
                case 461837218:
                    if (nextName.equals("backed_image")) {
                        c11 = '\n';
                    }
                    switch (c11) {
                    }
                    break;
                case 574151256:
                    if (nextName.equals("feature_animations")) {
                        c11 = 11;
                    }
                    switch (c11) {
                    }
                    break;
                case 725843758:
                    if (nextName.equals("stroke_line_cap")) {
                        c11 = '\f';
                    }
                    switch (c11) {
                    }
                    break;
                case 840178038:
                    if (nextName.equals("masking")) {
                        c11 = '\r';
                    }
                    switch (c11) {
                    }
                    break;
                default:
                    switch (c11) {
                    }
                    break;
            }
        }
        jsonReader.endObject();
        if (aVar.f129374a.toLowerCase().indexOf("event_") == 0) {
            return new C27501i(aVar);
        }
        return aVar.m140633a();
    }
}
