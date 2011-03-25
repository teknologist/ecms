/**
 * Copyright (C) 2009 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

/*
 * DO NOT EDIT THIS DOCUMENT MANUALLY !!!
 * THIS FILE IS AUTOMATICALLY GENERATED BY THE TOOLS UNDER
 *    AutoDetect/tools/
 */

package org.exoplatform.services.chars.chardet;

public class ISO2022JPVerifier extends Verifier
{

   public ISO2022JPVerifier()
   {


      cclass = new int[256 / 8];

      cclass[0] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0))))))) << 16)
             | (((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (2)))))))));
      cclass[1] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((0) << 4) | (0))))))) << 16)
             | (((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0)))))))));
      cclass[2] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0))))))) << 16)
             | (((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0)))))))));
      cclass[3] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0))))))) << 16)
             | (((((((((1) << 4) | (0)))) << 8) | (((((0) << 4) | (0)))))))));
      cclass[4] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (7))))))) << 16)
             | (((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0)))))))));
      cclass[5] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0))))))) << 16)
             | (((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (3)))))))));
      cclass[6] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0))))))) << 16)
             | (((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0)))))))));
      cclass[7] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0))))))) << 16)
             | (((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0)))))))));
      cclass[8] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0))))))) << 16)
             | (((((((((0) << 4) | (4)))) << 8) | (((((0) << 4) | (6)))))))));
      cclass[9] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0))))))) << 16)
             | (((((((((0) << 4) | (5)))) << 8) | (((((0) << 4) | (0)))))))));
      cclass[10] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0))))))) << 16)
             | (((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0)))))))));
      cclass[11] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0))))))) << 16)
             | (((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0)))))))));
      cclass[12] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0))))))) << 16)
             | (((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0)))))))));
      cclass[13] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0))))))) << 16)
             | (((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0)))))))));
      cclass[14] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0))))))) << 16)
             | (((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0)))))))));
      cclass[15] =
         ((((((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0))))))) << 16)
             | (((((((((0) << 4) | (0)))) << 8) | (((((0) << 4) | (0)))))))));
      cclass[16] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[17] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[18] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[19] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[20] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[21] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[22] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[23] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[24] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[25] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[26] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[27] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[28] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[29] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[30] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));
      cclass[31] =
         ((((((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2))))))) << 16)
             | (((((((((2) << 4) | (2)))) << 8) | (((((2) << 4) | (2)))))))));

      states = new int[6];

      states[0] =
         ((((((((((((eStart) << 4) | (eStart)))) << 8) | (((((eStart) << 4) | (eStart))))))) << 16)
             | (((((((((eStart) << 4) | (eError)))) << 8) | (((((3) << 4) | (eStart)))))))));
      states[1] =
         ((((((((((((eError) << 4) | (eError)))) << 8) | (((((eError) << 4) | (eError))))))) << 16)
             | (((((((((eError) << 4) | (eError)))) << 8) | (((((eError) << 4) | (eError)))))))));
      states[2] =
         ((((((((((((eItsMe) << 4) | (eItsMe)))) << 8) | (((((eItsMe) << 4) | (eItsMe))))))) << 16)
             | (((((((((eItsMe) << 4) | (eItsMe)))) << 8) | (((((eItsMe) << 4) | (eItsMe)))))))));
      states[3] =
         ((((((((((((4) << 4) | (eError)))) << 8) | (((((eError) << 4) | (eError))))))) << 16)
             | (((((((((5) << 4) | (eError)))) << 8) | (((((eError) << 4) | (eError)))))))));
      states[4] =
         ((((((((((((eError) << 4) | (eItsMe)))) << 8) | (((((eError) << 4) | (eItsMe))))))) << 16)
             | (((((((((eError) << 4) | (eError)))) << 8) | (((((eError) << 4) | (eError)))))))));
      states[5] =
         ((((((((((((eError) << 4) | (eError)))) << 8) | (((((eItsMe) << 4) | (eItsMe))))))) << 16)
             | (((((((((eError) << 4) | (eError)))) << 8) | (((((eError) << 4) | (eError)))))))));

      charset = "ISO-2022-JP";
      stFactor = 8;

   }

}
